package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.IpRangesJsonGet200ResponseValue;
import org.openapitools.server.api.MainApiException;

public final class DefaultApiException extends MainApiException {
    public DefaultApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final DefaultApiException Default_ipRangesJsonGet_200_Exception = new DefaultApiException(200, "A JSON object of regional cells with IP ranges.");
    

}