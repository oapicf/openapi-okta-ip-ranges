package org.openapitools.api.factories;

import org.openapitools.api.IpRangesJsonApiService;
import org.openapitools.api.impl.IpRangesJsonApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-02T04:09:44.456628780Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IpRangesJsonApiServiceFactory {
    private static final IpRangesJsonApiService service = new IpRangesJsonApiServiceImpl();

    public static IpRangesJsonApiService getIpRangesJsonApi() {
        return service;
    }
}
