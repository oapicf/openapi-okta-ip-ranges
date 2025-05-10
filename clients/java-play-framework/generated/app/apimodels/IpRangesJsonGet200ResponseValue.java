package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Object containing IP ranges for a specific regional cell
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2025-05-10T05:06:36.555705288Z[Etc/UTC]", comments = "Generator version: 7.12.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class IpRangesJsonGet200ResponseValue   {
  @JsonProperty("ip_ranges")
  
  private List<String> ipRanges = null;

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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

