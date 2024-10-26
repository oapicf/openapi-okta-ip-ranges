package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.IpRangesJsonGet200ResponseValue;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    Future<ApiResponse<Map<String, IpRangesJsonGet200ResponseValue>>> ipRangesJsonGet();
}
