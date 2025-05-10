package org.openapitools.api.factories;

import org.openapitools.api.IpRangesJsonApiService;
import org.openapitools.api.impl.IpRangesJsonApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-05-10T05:06:46.897530040Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class IpRangesJsonApiServiceFactory {
    private static final IpRangesJsonApiService service = new IpRangesJsonApiServiceImpl();

    public static IpRangesJsonApiService getIpRangesJsonApi() {
        return service;
    }
}
