package org.openapitools.server.api;

import java.util.HexFormat;
import org.openapitools.server.model.IpRangesJsonGet200ResponseValue;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Default'",
                             version = "7.9.0")
public interface DefaultService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/", this::ipRangesJsonGet);
    }


    /**
     * GET /ip_ranges.json : Retrieve Okta IP ranges.
     *
     * @param request the server request
     * @param response the server response
     */
    void ipRangesJsonGet(ServerRequest request, ServerResponse response);
}
