package org.openapitools.api

import org.openapitools.model.IpRangesJsonGet200ResponseValue
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class IpRangesJsonApiTest {

    private val api: IpRangesJsonApiController = IpRangesJsonApiController()

    /**
     * To test IpRangesJsonApiController.ipRangesJsonGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun ipRangesJsonGetTest() {
        val response: ResponseEntity<Map<String, IpRangesJsonGet200ResponseValue>> = api.ipRangesJsonGet()

        // TODO: test validations
    }
}
