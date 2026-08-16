{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DuplicateRecordFields      #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module OpenAPIOktaIPRanges.Types (
  IpRangesJsonGet200ResponseValue (..),
  ) where

import Data.Data (Data)
import Data.UUID (UUID)
import Data.List (lookup)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import Data.Set (Set)
import Data.Text (Text)
import Data.Time
import Data.Swagger (ToSchema, declareNamedSchema)
import qualified Data.Swagger as Swagger
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)


-- | Object containing IP ranges for a specific regional cell
data IpRangesJsonGet200ResponseValue = IpRangesJsonGet200ResponseValue
  { ipRangesJsonGet200ResponseValueIpUnderscoreranges :: Maybe [Text] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON IpRangesJsonGet200ResponseValue where
  parseJSON = genericParseJSON optionsIpRangesJsonGet200ResponseValue
instance ToJSON IpRangesJsonGet200ResponseValue where
  toJSON = genericToJSON optionsIpRangesJsonGet200ResponseValue
instance ToSchema IpRangesJsonGet200ResponseValue where
  declareNamedSchema = Swagger.genericDeclareNamedSchema
    $ Swagger.fromAesonOptions
    $ optionsIpRangesJsonGet200ResponseValue

optionsIpRangesJsonGet200ResponseValue :: Options
optionsIpRangesJsonGet200ResponseValue =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("ipRangesJsonGet200ResponseValueIpUnderscoreranges", "ip_ranges")
      ]

