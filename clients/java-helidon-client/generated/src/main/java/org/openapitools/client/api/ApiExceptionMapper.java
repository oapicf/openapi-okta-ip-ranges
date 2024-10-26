/**
 * OpenAPI Okta IP Ranges
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;

import org.eclipse.microprofile.rest.client.ext.ResponseExceptionMapper;

@Provider
public class ApiExceptionMapper implements ResponseExceptionMapper<ApiException> {

    @Override
    public boolean handles(int status, MultivaluedMap<String, Object> headers) {
        return status >= 400;
    }

    @Override
    public ApiException toThrowable(Response response) {
        return new ApiException(response);
    }
}
