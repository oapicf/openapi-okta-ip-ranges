package org.openapitools.api.consumer;

import org.openapitools.model.IpRangesJsonGet200ResponseValue;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.IpRangesJsonService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/ip_ranges.json")
public class IpRangesJsonServiceController {

    @DubboReference
    private IpRangesJsonService ipRangesJsonService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public Map<String, IpRangesJsonGet200ResponseValue> ipRangesJsonGet(
    ) {
        return ipRangesJsonService.ipRangesJsonGet();
    }
}
