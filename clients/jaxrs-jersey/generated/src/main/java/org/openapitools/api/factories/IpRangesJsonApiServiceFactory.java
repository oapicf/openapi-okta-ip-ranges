package org.openapitools.api.factories;

import org.openapitools.api.IpRangesJsonApiService;
import org.openapitools.api.impl.IpRangesJsonApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-10-26T04:03:07.497615236Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class IpRangesJsonApiServiceFactory {
    private static final IpRangesJsonApiService service = new IpRangesJsonApiServiceImpl();

    public static IpRangesJsonApiService getIpRangesJsonApi() {
        return service;
    }
}
