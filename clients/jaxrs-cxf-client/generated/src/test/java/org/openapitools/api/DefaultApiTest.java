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


package org.openapitools.api;

import org.openapitools.model.IpRangesJsonGet200ResponseValue;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * OpenAPI Okta IP Ranges
 *
 * <p>OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * API tests for DefaultApi
 */
public class DefaultApiTest {


    private DefaultApi api;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://s3.amazonaws.com/okta-ip-ranges", DefaultApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
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
    public void ipRangesJsonGetTest() {
        //Map<String, IpRangesJsonGet200ResponseValue> response = api.ipRangesJsonGet();
        //assertNotNull(response);
        // TODO: test validations


    }
    
}
