{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.DefaultSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getIpRangesJsonR" $
        it "returns 501 Not Implemented" $ do
            get IpRangesJsonR
            statusIs 501
