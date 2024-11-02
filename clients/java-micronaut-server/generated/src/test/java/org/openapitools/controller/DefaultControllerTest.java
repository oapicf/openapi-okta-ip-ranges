package org.openapitools.controller;

import org.openapitools.model.IpRangesJsonGet200ResponseValue;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for DefaultController
 */
@MicronautTest
public class DefaultControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    DefaultController controller;

    /**
     * This test is used to validate the implementation of ipRangesJsonGet() method
     *
     * The method should: Retrieve Okta IP ranges
     *
     * Returns IP ranges organized by regional cell names.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void ipRangesJsonGetMethodTest() {
        // given

        // when
        Map<String, IpRangesJsonGet200ResponseValue> result = controller.ipRangesJsonGet().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ip_ranges.json' to the features of ipRangesJsonGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void ipRangesJsonGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ip_ranges.json").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@304b9f1a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(Map.class, String.class, IpRangesJsonGet200ResponseValue.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
