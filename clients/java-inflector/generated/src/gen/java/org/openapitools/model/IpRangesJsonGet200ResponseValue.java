package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * Object containing IP ranges for a specific regional cell
 **/

@ApiModel(description = "Object containing IP ranges for a specific regional cell")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2025-05-10T05:06:31.205198578Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class IpRangesJsonGet200ResponseValue   {
  @JsonProperty("ip_ranges")
  private List<String> ipRanges = null;

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
    return Objects.equals(ipRanges, ipRangesJsonGet200ResponseValue.ipRanges);
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

