/**
 * OpenAPI Okta IP Ranges
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * The version of the OpenAPI document: 1.0.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import jakarta.ws.rs.core.Response;

public class ApiException extends Exception {
    private static final long serialVersionUID = 1L;

    private final Response response;

    public ApiException(Response response) {
        super("Api response has status code " + response.getStatus());
        this.response = response;
    }

    public Response getResponse() {
        return this.response;
    }
}
