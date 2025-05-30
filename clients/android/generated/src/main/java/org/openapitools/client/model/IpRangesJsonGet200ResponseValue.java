/**
 * OpenAPI Okta IP Ranges
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * The version of the OpenAPI document: 1.0.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Object containing IP ranges for a specific regional cell
 **/
@ApiModel(description = "Object containing IP ranges for a specific regional cell")
public class IpRangesJsonGet200ResponseValue {
  
  @SerializedName("ip_ranges")
  private List<String> ipRanges = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getIpRanges() {
    return ipRanges;
  }
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
    return (this.ipRanges == null ? ipRangesJsonGet200ResponseValue.ipRanges == null : this.ipRanges.equals(ipRangesJsonGet200ResponseValue.ipRanges));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.ipRanges == null ? 0: this.ipRanges.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpRangesJsonGet200ResponseValue {\n");
    
    sb.append("  ipRanges: ").append(ipRanges).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
