package org.openapitools.api.factories;

import org.openapitools.api.IpRangesJsonApiService;
import org.openapitools.api.impl.IpRangesJsonApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-07T05:06:08.203094472Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class IpRangesJsonApiServiceFactory {
    private static final IpRangesJsonApiService service = new IpRangesJsonApiServiceImpl();

    public static IpRangesJsonApiService getIpRangesJsonApi() {
        return service;
    }
}
