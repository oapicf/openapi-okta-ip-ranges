@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class IpRangesJsonGet200ResponseValue(
    @field:JsonProperty("ip_ranges")
    val ipRanges: kotlin.collections.List<kotlin.String>? = null,

)
