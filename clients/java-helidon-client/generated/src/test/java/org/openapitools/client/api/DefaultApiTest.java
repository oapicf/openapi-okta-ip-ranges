/**
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


package org.openapitools.client.api;

import org.openapitools.client.model.IpRangesJsonGet200ResponseValue;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * OpenAPI Okta IP Ranges Test
 *
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private static DefaultApi client;
    private static final String baseUrl = "http://localhost:8080";

    @BeforeAll
    public static void setup() throws MalformedURLException {
        client = RestClientBuilder.newBuilder()
                        .baseUrl(new URL(baseUrl))
                        .register(ApiException.class)
                        .build(DefaultApi.class);
    }

    
    /**
     * Retrieve Okta IP ranges
     *
     * Returns IP ranges organized by regional cell names.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ipRangesJsonGetTest() throws Exception {
        //Map<String, IpRangesJsonGet200ResponseValue> response = client.ipRangesJsonGet();
        //assertNotNull(response);
    }
    
}
