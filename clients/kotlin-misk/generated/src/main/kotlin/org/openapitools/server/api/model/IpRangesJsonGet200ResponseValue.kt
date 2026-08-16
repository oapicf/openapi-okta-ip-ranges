package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IpRangesJsonGet200ResponseValue(
    val ipRanges: kotlin.collections.List<kotlin.String>? = null
)
