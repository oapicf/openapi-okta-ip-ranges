package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object containing IP ranges for a specific regional cell
 */
public class IpRangesJsonGet200ResponseValue   {

    private List<String> ipRanges = new ArrayList<>();

    /**
     * Default constructor.
     */
    public IpRangesJsonGet200ResponseValue() {
    // JSON-B / Jackson
    }

    /**
     * Create IpRangesJsonGet200ResponseValue.
     *
     * @param ipRanges ipRanges
     */
    public IpRangesJsonGet200ResponseValue(
        List<String> ipRanges
    ) {
        this.ipRanges = ipRanges;
    }



    /**
     * Get ipRanges
     * @return ipRanges
     */
    public List<String> getIpRanges() {
        return ipRanges;
    }

    public void setIpRanges(List<String> ipRanges) {
        this.ipRanges = ipRanges;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

