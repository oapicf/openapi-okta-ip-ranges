{-# LANGUAGE DataKinds                  #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DeriveTraversable          #-}
{-# LANGUAGE FlexibleContexts           #-}
{-# LANGUAGE FlexibleInstances          #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE OverloadedStrings          #-}
{-# LANGUAGE RecordWildCards            #-}
{-# LANGUAGE TypeFamilies               #-}
{-# LANGUAGE TypeOperators              #-}
{-# LANGUAGE ViewPatterns               #-}
{-# OPTIONS_GHC
-fno-warn-unused-binds -fno-warn-unused-imports -freduction-depth=328 #-}

module OpenAPIOktaIPRanges.API
  ( -- * Client and Server
    Config(..)
  , OpenAPIOktaIPRangesBackend(..)
  , createOpenAPIOktaIPRangesClient
  , runOpenAPIOktaIPRangesServer
  , runOpenAPIOktaIPRangesMiddlewareServer
  , runOpenAPIOktaIPRangesClient
  , runOpenAPIOktaIPRangesClientWithManager
  , callOpenAPIOktaIPRanges
  , OpenAPIOktaIPRangesClient
  , OpenAPIOktaIPRangesClientError(..)
  -- ** Servant
  , OpenAPIOktaIPRangesAPI
  -- ** Plain WAI Application
  , serverWaiApplicationOpenAPIOktaIPRanges
  ) where

import           OpenAPIOktaIPRanges.Types

import           Control.Monad.Catch                (Exception, MonadThrow, throwM)
import           Control.Monad.Except               (ExceptT, runExceptT)
import           Control.Monad.IO.Class
import           Control.Monad.Trans.Reader         (ReaderT (..))
import           Data.Aeson                         (Value)
import qualified Data.Aeson                         as Aeson
import qualified Data.ByteString.Lazy               as BSL
import           Data.Coerce                        (coerce)
import           Data.Data                          (Data)
import           Data.Function                      ((&))
import qualified Data.Map                           as Map
import           Data.Monoid                        ((<>))
import           Data.Proxy                         (Proxy (..))
import           Data.Set                           (Set)
import           Data.Text                          (Text)
import qualified Data.Text                          as T
import qualified Data.Text.Encoding                 as T
import           Data.Time
import           Data.UUID                          (UUID)
import           GHC.Exts                           (IsString (..))
import           GHC.Generics                       (Generic)
import           Network.HTTP.Client                (Manager, newManager)
import           Network.HTTP.Client.TLS            (tlsManagerSettings)
import           Network.HTTP.Types.Method          (methodOptions)
import           Network.Wai                        (Middleware)
import qualified Network.Wai.Handler.Warp           as Warp
import           Servant                            (ServerError, serveWithContextT)
import           Servant.API                        hiding (addHeader)
import           Servant.API.Verbs                  (StdMethod (..), Verb)
import           Servant.Client                     (ClientEnv, Scheme (Http), ClientError, client,
                                                     mkClientEnv, parseBaseUrl)
import           Servant.Client.Core                (baseUrlPort, baseUrlHost)
import           Servant.Client.Internal.HttpClient (ClientM (..))
import           Servant.Server                     (Handler (..), Application, Context (EmptyContext))
import           Servant.Server.StaticFiles         (serveDirectoryFileServer)
import           Web.FormUrlEncoded
import           Web.HttpApiData




-- | List of elements parsed from a query.
newtype QueryList (p :: CollectionFormat) a = QueryList
  { fromQueryList :: [a]
  } deriving (Functor, Applicative, Monad, Foldable, Traversable)

-- | Formats in which a list can be encoded into a HTTP path.
data CollectionFormat
  = CommaSeparated -- ^ CSV format for multiple parameters.
  | SpaceSeparated -- ^ Also called "SSV"
  | TabSeparated -- ^ Also called "TSV"
  | PipeSeparated -- ^ `value1|value2|value2`
  | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. Only for GET params.

instance FromHttpApiData a => FromHttpApiData (QueryList 'CommaSeparated a) where
  parseQueryParam = parseSeparatedQueryList ','

instance FromHttpApiData a => FromHttpApiData (QueryList 'TabSeparated a) where
  parseQueryParam = parseSeparatedQueryList '\t'

instance FromHttpApiData a => FromHttpApiData (QueryList 'SpaceSeparated a) where
  parseQueryParam = parseSeparatedQueryList ' '

instance FromHttpApiData a => FromHttpApiData (QueryList 'PipeSeparated a) where
  parseQueryParam = parseSeparatedQueryList '|'

instance FromHttpApiData a => FromHttpApiData (QueryList 'MultiParamArray a) where
  parseQueryParam = error "unimplemented FromHttpApiData for MultiParamArray collection format"

parseSeparatedQueryList :: FromHttpApiData a => Char -> Text -> Either Text (QueryList p a)
parseSeparatedQueryList char = fmap QueryList . mapM parseQueryParam . T.split (== char)

instance ToHttpApiData a => ToHttpApiData (QueryList 'CommaSeparated a) where
  toQueryParam = formatSeparatedQueryList ','

instance ToHttpApiData a => ToHttpApiData (QueryList 'TabSeparated a) where
  toQueryParam = formatSeparatedQueryList '\t'

instance ToHttpApiData a => ToHttpApiData (QueryList 'SpaceSeparated a) where
  toQueryParam = formatSeparatedQueryList ' '

instance ToHttpApiData a => ToHttpApiData (QueryList 'PipeSeparated a) where
  toQueryParam = formatSeparatedQueryList '|'

instance ToHttpApiData a => ToHttpApiData (QueryList 'MultiParamArray a) where
  toQueryParam = error "unimplemented ToHttpApiData for MultiParamArray collection format"

formatSeparatedQueryList :: ToHttpApiData a => Char ->  QueryList p a -> Text
formatSeparatedQueryList char = T.intercalate (T.singleton char) . map toQueryParam . fromQueryList

newtype JSONQueryParam a = JSONQueryParam
  { fromJsonQueryParam :: a
  } deriving (Functor, Foldable, Traversable)

instance Aeson.ToJSON a => ToHttpApiData (JSONQueryParam a) where
  toQueryParam = T.decodeUtf8 . BSL.toStrict . Aeson.encode . fromJsonQueryParam

instance Aeson.FromJSON a => FromHttpApiData (JSONQueryParam a) where
  parseQueryParam = either (Left . T.pack) (Right . JSONQueryParam) . Aeson.eitherDecodeStrict . T.encodeUtf8


-- | Servant type-level API, generated from the OpenAPI spec for OpenAPIOktaIPRanges.
type OpenAPIOktaIPRangesAPI
    =    "ip_ranges.json" :> Verb 'GET 200 '[JSON] ((Map.Map String IpRangesJsonGet200ResponseValue)) -- 'ipRangesJsonGet' route
    :<|> Raw


-- | Server or client configuration, specifying the host and port to query or serve on.
data Config = Config
  { configUrl :: String  -- ^ scheme://hostname:port/path, e.g. "http://localhost:8080/"
  } deriving (Eq, Ord, Show, Read)


-- | Custom exception type for our errors.
newtype OpenAPIOktaIPRangesClientError = OpenAPIOktaIPRangesClientError ClientError
  deriving (Show, Exception)
-- | Configuration, specifying the full url of the service.


-- | Backend for OpenAPIOktaIPRanges.
-- The backend can be used both for the client and the server. The client generated from the OpenAPIOktaIPRanges OpenAPI spec
-- is a backend that executes actions by sending HTTP requests (see @createOpenAPIOktaIPRangesClient@). Alternatively, provided
-- a backend, the API can be served using @runOpenAPIOktaIPRangesMiddlewareServer@.
data OpenAPIOktaIPRangesBackend m = OpenAPIOktaIPRangesBackend
  { ipRangesJsonGet :: m ((Map.Map String IpRangesJsonGet200ResponseValue)){- ^ Returns IP ranges organized by regional cell names. -}
  }


newtype OpenAPIOktaIPRangesClient a = OpenAPIOktaIPRangesClient
  { runClient :: ClientEnv -> ExceptT ClientError IO a
  } deriving Functor

instance Applicative OpenAPIOktaIPRangesClient where
  pure x = OpenAPIOktaIPRangesClient (\_ -> pure x)
  (OpenAPIOktaIPRangesClient f) <*> (OpenAPIOktaIPRangesClient x) =
    OpenAPIOktaIPRangesClient (\env -> f env <*> x env)

instance Monad OpenAPIOktaIPRangesClient where
  (OpenAPIOktaIPRangesClient a) >>= f =
    OpenAPIOktaIPRangesClient (\env -> do
      value <- a env
      runClient (f value) env)

instance MonadIO OpenAPIOktaIPRangesClient where
  liftIO io = OpenAPIOktaIPRangesClient (\_ -> liftIO io)

createOpenAPIOktaIPRangesClient :: OpenAPIOktaIPRangesBackend OpenAPIOktaIPRangesClient
createOpenAPIOktaIPRangesClient = OpenAPIOktaIPRangesBackend{..}
  where
    ((coerce -> ipRangesJsonGet) :<|>
     _) = client (Proxy :: Proxy OpenAPIOktaIPRangesAPI)

-- | Run requests in the OpenAPIOktaIPRangesClient monad.
runOpenAPIOktaIPRangesClient :: Config -> OpenAPIOktaIPRangesClient a -> ExceptT ClientError IO a
runOpenAPIOktaIPRangesClient clientConfig cl = do
  manager <- liftIO $ newManager tlsManagerSettings
  runOpenAPIOktaIPRangesClientWithManager manager clientConfig cl

-- | Run requests in the OpenAPIOktaIPRangesClient monad using a custom manager.
runOpenAPIOktaIPRangesClientWithManager :: Manager -> Config -> OpenAPIOktaIPRangesClient a -> ExceptT ClientError IO a
runOpenAPIOktaIPRangesClientWithManager manager Config{..} cl = do
  url <- parseBaseUrl configUrl
  runClient cl $ mkClientEnv manager url

-- | Like @runClient@, but returns the response or throws
--   a OpenAPIOktaIPRangesClientError
callOpenAPIOktaIPRanges
  :: (MonadIO m, MonadThrow m)
  => ClientEnv -> OpenAPIOktaIPRangesClient a -> m a
callOpenAPIOktaIPRanges env f = do
  res <- liftIO $ runExceptT $ runClient f env
  case res of
    Left err       -> throwM (OpenAPIOktaIPRangesClientError err)
    Right response -> pure response


requestMiddlewareId :: Application -> Application
requestMiddlewareId a = a

-- | Run the OpenAPIOktaIPRanges server at the provided host and port.
runOpenAPIOktaIPRangesServer
  :: (MonadIO m, MonadThrow m)
  => Config -> OpenAPIOktaIPRangesBackend (ExceptT ServerError IO) -> m ()
runOpenAPIOktaIPRangesServer config backend = runOpenAPIOktaIPRangesMiddlewareServer config requestMiddlewareId backend

-- | Run the OpenAPIOktaIPRanges server at the provided host and port.
runOpenAPIOktaIPRangesMiddlewareServer
  :: (MonadIO m, MonadThrow m)
  => Config -> Middleware -> OpenAPIOktaIPRangesBackend (ExceptT ServerError IO) -> m ()
runOpenAPIOktaIPRangesMiddlewareServer Config{..} middleware backend = do
  url <- parseBaseUrl configUrl
  let warpSettings = Warp.defaultSettings
        & Warp.setPort (baseUrlPort url)
        & Warp.setHost (fromString $ baseUrlHost url)
  liftIO $ Warp.runSettings warpSettings $ middleware $ serverWaiApplicationOpenAPIOktaIPRanges backend

-- | Plain "Network.Wai" Application for the OpenAPIOktaIPRanges server.
--
-- Can be used to implement e.g. tests that call the API without a full webserver.
serverWaiApplicationOpenAPIOktaIPRanges :: OpenAPIOktaIPRangesBackend (ExceptT ServerError IO) -> Application
serverWaiApplicationOpenAPIOktaIPRanges backend = serveWithContextT (Proxy :: Proxy OpenAPIOktaIPRangesAPI) context id (serverFromBackend backend)
  where
    context = serverContext
    serverFromBackend OpenAPIOktaIPRangesBackend{..} =
      (coerce ipRangesJsonGet :<|>
       serveDirectoryFileServer "static")


serverContext :: Context ('[])
serverContext = EmptyContext
