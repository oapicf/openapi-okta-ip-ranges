package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.IpRangesJsonGet200ResponseValue

class DefaultApi {
    String basePath = "https://s3.amazonaws.com/okta-ip-ranges"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def ipRangesJsonGet ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ip_ranges.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "map",
                    IpRangesJsonGet200ResponseValue.class )

    }

}
