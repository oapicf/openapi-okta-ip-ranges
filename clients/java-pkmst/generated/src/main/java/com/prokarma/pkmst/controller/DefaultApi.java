/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.IpRangesJsonGet200ResponseValue;
import java.util.Map;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-10-26T04:02:18.643615634Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@Api(value = "Default", description = "the Default API")
public interface DefaultApi {

    @ApiOperation(value = "Retrieve Okta IP ranges", notes = "Returns IP ranges organized by regional cell names.", response = IpRangesJsonGet200ResponseValue.class, responseContainer = "Map", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A JSON object of regional cells with IP ranges.", response = IpRangesJsonGet200ResponseValue.class, responseContainer = "Map") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/ip_ranges.json",
        produces = { "application/json" }
    )
    ResponseEntity<Map<String, IpRangesJsonGet200ResponseValue>> ipRangesJsonGet( @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
