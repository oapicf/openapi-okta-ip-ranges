/*
 * OpenAPI Okta IP Ranges
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * The version of the OpenAPI document: 0.10.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.controller;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.convert.format.Format;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import reactor.core.publisher.Mono;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import org.openapitools.model.IpRangesJsonGet200ResponseValue;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-02T04:09:07.156289308Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Controller
@Tag(name = "Default", description = "The Default API")
public class DefaultController {
    /**
     * Retrieve Okta IP ranges
     * Returns IP ranges organized by regional cell names.
     *
     * @return Map&lt;String, IpRangesJsonGet200ResponseValue&gt;
     * Okta IP Ranges Documentation
     * @see <a href="https://help.okta.com/en-us/content/topics/security/ip-address-allow-listing.htm">Retrieve Okta IP ranges Documentation</a>
     */
    @Operation(
        operationId = "ipRangesJsonGet",
        summary = "Retrieve Okta IP ranges",
        responses = {
            @ApiResponse(responseCode = "200", description = "A JSON object of regional cells with IP ranges.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = IpRangesJsonGet200ResponseValue.class))
            })
        }
    )
    @Get(uri="/ip_ranges.json")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public Mono<Map<String, IpRangesJsonGet200ResponseValue>> ipRangesJsonGet() {
        // TODO implement ipRangesJsonGet();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}
