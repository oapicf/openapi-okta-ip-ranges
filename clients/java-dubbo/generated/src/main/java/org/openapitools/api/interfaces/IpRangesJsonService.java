package org.openapitools.api.interfaces;

import org.openapitools.model.IpRangesJsonGet200ResponseValue;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface IpRangesJsonService {

    /**
     * Retrieve Okta IP ranges
     * Returns IP ranges organized by regional cell names.
     *
     * @return Map<String, IpRangesJsonGet200ResponseValue>
     */
    Map<String, IpRangesJsonGet200ResponseValue> ipRangesJsonGet(
    );
}
