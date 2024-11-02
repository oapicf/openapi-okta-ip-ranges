/*
 * OpenAPI Okta IP Ranges
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * The version of the OpenAPI document: 0.10.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Object containing IP ranges for a specific regional cell
 */
@Schema(name = "_ip_ranges_json_get_200_response_value", description = "Object containing IP ranges for a specific regional cell")
@JsonPropertyOrder({
  IpRangesJsonGet200ResponseValue.JSON_PROPERTY_IP_RANGES
})
@JsonTypeName("_ip_ranges_json_get_200_response_value")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-02T04:09:07.156289308Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class IpRangesJsonGet200ResponseValue {
    public static final String JSON_PROPERTY_IP_RANGES = "ip_ranges";
    private List<String> ipRanges = null;

    public IpRangesJsonGet200ResponseValue() {
    }

    public IpRangesJsonGet200ResponseValue ipRanges(List<String> ipRanges) {
        this.ipRanges = ipRanges;
        return this;
    }

    public IpRangesJsonGet200ResponseValue addIpRangesItem(String ipRangesItem) {
        if (this.ipRanges == null) {
            this.ipRanges = new ArrayList<>();
        }
        this.ipRanges.add(ipRangesItem);
        return this;
    }

    /**
     * Get ipRanges
     * @return ipRanges
     */
    @Nullable
    @Schema(name = "ip_ranges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_IP_RANGES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getIpRanges() {
        return ipRanges;
    }

    @JsonProperty(JSON_PROPERTY_IP_RANGES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIpRanges(List<String> ipRanges) {
        this.ipRanges = ipRanges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue = (IpRangesJsonGet200ResponseValue) o;
        return Objects.equals(this.ipRanges, ipRangesJsonGet200ResponseValue.ipRanges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipRanges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpRangesJsonGet200ResponseValue {\n");
        sb.append("    ipRanges: ").append(toIndentedString(ipRanges)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

