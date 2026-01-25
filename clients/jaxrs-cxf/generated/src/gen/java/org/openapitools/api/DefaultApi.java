package org.openapitools.api;

import org.openapitools.model.IpRangesJsonGet200ResponseValue;
import java.util.Map;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * OpenAPI Okta IP Ranges
 *
 * <p>OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 */
@Path("/ip_ranges.json")
@Api(value = "/", description = "")
public interface DefaultApi  {

    /**
     * Retrieve Okta IP ranges
     *
     * Returns IP ranges organized by regional cell names.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Okta IP ranges", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A JSON object of regional cells with IP ranges.", response = IpRangesJsonGet200ResponseValue.class, responseContainer = "Map") })
    public Map<String, IpRangesJsonGet200ResponseValue> ipRangesJsonGet();
}
