/*
 * OpenAPI Okta IP Ranges
 *
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * OpenAPI document version: 1.0.1-pre.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.handler;

import io.undertow.server.*;
import io.undertow.util.*;

import org.openapitools.model.*;

@SuppressWarnings("TooManyFunctions")
public interface PathHandlerInterface {

    /**
     * <p>Retrieve Okta IP ranges</p>
     *
     * <p>Returns IP ranges organized by regional cell names.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/okta-ip-ranges/ip_ranges.json" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.Map Map} of {@link IpRangesJsonGet200ResponseValue}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: A JSON object of regional cells with IP ranges.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler ipRangesJsonGet();
}
