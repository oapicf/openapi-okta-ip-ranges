package org.openapitools.api;

import org.openapitools.model.IpRangesJsonGet200ResponseValue;
import java.util.Map;
import org.openapitools.api.IpRangesJsonApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@Path("/ip_ranges.json")
@RequestScoped

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-08-16T02:01:31.232452271Z[Etc/UTC]", comments = "Generator version: 7.24.0")

public class IpRangesJsonApi  {

  @Context SecurityContext securityContext;

  @Inject IpRangesJsonApiService delegate;


    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Okta IP ranges", notes = "Returns IP ranges organized by regional cell names.", response = IpRangesJsonGet200ResponseValue.class, responseContainer = "Map", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A JSON object of regional cells with IP ranges.", response = IpRangesJsonGet200ResponseValue.class, responseContainer = "Map") })
    public Response ipRangesJsonGet() {
        return delegate.ipRangesJsonGet(securityContext);
    }
}
