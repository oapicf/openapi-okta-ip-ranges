package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object containing IP ranges for a specific regional cell
 **/
@ApiModel(description="Object containing IP ranges for a specific regional cell")

public class IpRangesJsonGet200ResponseValue  {
  
  @ApiModelProperty(value = "")
  private List<String> ipRanges = new ArrayList<>();
 /**
   * Get ipRanges
   * @return ipRanges
  **/
  @JsonProperty("ip_ranges")
  public List<String> getIpRanges() {
    return ipRanges;
  }

  public void setIpRanges(List<String> ipRanges) {
    this.ipRanges = ipRanges;
  }

  public IpRangesJsonGet200ResponseValue ipRanges(List<String> ipRanges) {
    this.ipRanges = ipRanges;
    return this;
  }

  public IpRangesJsonGet200ResponseValue addIpRangesItem(String ipRangesItem) {
    this.ipRanges.add(ipRangesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

