package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.IpRangesJsonGet200ResponseValue;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    //GET_ip_ranges.json
    void ipRangesJsonGet(Handler<AsyncResult<Map<String, IpRangesJsonGet200ResponseValue>>> handler);

}
