(ns open-api-okta-ip-ranges.api.default
  (:require [open-api-okta-ip-ranges.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [open-api-okta-ip-ranges.specs.-ip-ranges-json-get-200-response-value :refer :all]
            )
  (:import (java.io File)))


(defn-spec ip-ranges-json-get-with-http-info any?
  "Retrieve Okta IP ranges
  Returns IP ranges organized by regional cell names."
  []
  (call-api "/ip_ranges.json" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec ip-ranges-json-get (s/map-of string? -ip-ranges-json-get-200-response-value-spec)
  "Retrieve Okta IP ranges
  Returns IP ranges organized by regional cell names."
  []
  (let [res (:data (ip-ranges-json-get-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode (s/map-of string? -ip-ranges-json-get-200-response-value-spec) res st/string-transformer)
       res)))


