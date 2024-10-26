package org.openapitools.api;

import org.openapitools.model.IpRangesJsonGet200ResponseValue;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

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
