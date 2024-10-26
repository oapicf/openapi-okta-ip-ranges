{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Default where

import           Import


-- | Retrieve Okta IP ranges
--
-- Returns IP ranges organized by regional cell names.
-- operationId: ipRangesJsonGet
getIpRangesJsonR :: Handler Value
getIpRangesJsonR = notImplemented
