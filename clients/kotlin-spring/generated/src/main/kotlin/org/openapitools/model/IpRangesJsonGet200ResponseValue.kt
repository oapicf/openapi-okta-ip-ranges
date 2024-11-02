package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Object containing IP ranges for a specific regional cell
 * @param ipRanges 
 */
data class IpRangesJsonGet200ResponseValue(

    @Schema(example = "null", description = "")
    @get:JsonProperty("ip_ranges") val ipRanges: kotlin.collections.List<kotlin.String>? = null
    ) {

}

