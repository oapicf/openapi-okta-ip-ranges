package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object containing IP ranges for a specific regional cell
 */

@Schema(name = "_ip_ranges_json_get_200_response_value", description = "Object containing IP ranges for a specific regional cell")
@JsonTypeName("_ip_ranges_json_get_200_response_value")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-02T00:30:24.416666975Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IpRangesJsonGet200ResponseValue {

  @Valid
  private List<String> ipRanges = new ArrayList<>();

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
  
  @Schema(name = "ip_ranges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

