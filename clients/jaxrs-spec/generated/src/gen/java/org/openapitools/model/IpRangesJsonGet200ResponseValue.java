package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Object containing IP ranges for a specific regional cell
 **/
@ApiModel(description = "Object containing IP ranges for a specific regional cell")
@JsonTypeName("_ip_ranges_json_get_200_response_value")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-05-10T05:06:50.495088549Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class IpRangesJsonGet200ResponseValue   {
  private @Valid List<String> ipRanges = new ArrayList<>();

  public IpRangesJsonGet200ResponseValue() {
  }

  /**
   **/
  public IpRangesJsonGet200ResponseValue ipRanges(List<String> ipRanges) {
    this.ipRanges = ipRanges;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ip_ranges")
  public List<String> getIpRanges() {
    return ipRanges;
  }

  @JsonProperty("ip_ranges")
  public void setIpRanges(List<String> ipRanges) {
    this.ipRanges = ipRanges;
  }

  public IpRangesJsonGet200ResponseValue addIpRangesItem(String ipRangesItem) {
    if (this.ipRanges == null) {
      this.ipRanges = new ArrayList<>();
    }

    this.ipRanges.add(ipRangesItem);
    return this;
  }

  public IpRangesJsonGet200ResponseValue removeIpRangesItem(String ipRangesItem) {
    if (ipRangesItem != null && this.ipRanges != null) {
      this.ipRanges.remove(ipRangesItem);
    }

    return this;
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

