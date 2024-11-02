package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.IpRangesJsonApiService;
import org.openapitools.api.factories.IpRangesJsonApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.IpRangesJsonGet200ResponseValue;
import java.util.Map;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/ip_ranges.json")


@io.swagger.annotations.Api(description = "the ip_ranges.json API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-02T00:27:16.886295708Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IpRangesJsonApi  {
   private final IpRangesJsonApiService delegate = IpRangesJsonApiServiceFactory.getIpRangesJsonApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve Okta IP ranges", notes = "Returns IP ranges organized by regional cell names.", response = IpRangesJsonGet200ResponseValue.class, responseContainer = "Map", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A JSON object of regional cells with IP ranges.", response = IpRangesJsonGet200ResponseValue.class, responseContainer = "Map") })
    public Response ipRangesJsonGet()
    throws NotFoundException {
        return delegate.ipRangesJsonGet();
    }
}
