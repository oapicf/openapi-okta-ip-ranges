package org.openapitools.server.api;

import org.openapitools.server.model.IpRangesJsonGet200ResponseValue;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;
import io.helidon.webserver.Service;

public interface DefaultService extends Service { 

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void update(Routing.Rules rules) {
        rules.get("/ip_ranges.json", this::ipRangesJsonGet);
    }


    /**
     * GET /ip_ranges.json : Retrieve Okta IP ranges.
     * @param request the server request
     * @param response the server response
     */
    void ipRangesJsonGet(ServerRequest request, ServerResponse response);

}
