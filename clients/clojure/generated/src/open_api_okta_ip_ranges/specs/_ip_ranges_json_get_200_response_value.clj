(ns open-api-okta-ip-ranges.specs.-ip-ranges-json-get-200-response-value
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def -ip-ranges-json-get-200-response-value-data
  {
   (ds/opt :ip_ranges) (s/coll-of string?)
   })

(def -ip-ranges-json-get-200-response-value-spec
  (ds/spec
    {:name ::-ip-ranges-json-get-200-response-value
     :spec -ip-ranges-json-get-200-response-value-data}))
