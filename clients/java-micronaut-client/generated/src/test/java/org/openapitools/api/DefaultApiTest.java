package org.openapitools.api;

import org.openapitools.model.IpRangesJsonGet200ResponseValue;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for DefaultApi
 */
@MicronautTest
public class DefaultApiTest {

    @Inject
    DefaultApi api;

    
    /**
     * Retrieve Okta IP ranges
     *
     * Returns IP ranges organized by regional cell names.
     */
    @Test
    @Disabled("Not Implemented")
    public void ipRangesJsonGetTest() {
        // given

        // when
        Map<String, IpRangesJsonGet200ResponseValue> body = api.ipRangesJsonGet().block();

        // then
        // TODO implement the ipRangesJsonGetTest()
    }

    
}
