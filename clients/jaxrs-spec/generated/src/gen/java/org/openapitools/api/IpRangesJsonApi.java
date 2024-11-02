package org.openapitools.api;

import org.openapitools.model.IpRangesJsonGet200ResponseValue;
import java.util.Map;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/ip_ranges.json")
@Api(description = "the ip_ranges.json API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-02T00:27:51.763297088Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IpRangesJsonApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Okta IP ranges", notes = "Returns IP ranges organized by regional cell names.", response = IpRangesJsonGet200ResponseValue.class, responseContainer = "Map", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A JSON object of regional cells with IP ranges.", response = IpRangesJsonGet200ResponseValue.class, responseContainer = "Map")
    })
    public Response ipRangesJsonGet() {
        return Response.ok().entity("magic!").build();
    }
}
