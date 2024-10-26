package controllers;

import apimodels.IpRangesJsonGet200ResponseValue;
import java.util.Map;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class DefaultApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result ipRangesJsonGetHttp(Http.Request request) throws Exception {
        Map<String, IpRangesJsonGet200ResponseValue> obj = ipRangesJsonGet(request);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Map.Entry<String, IpRangesJsonGet200ResponseValue> entry : obj.entrySet()) {
                OpenAPIUtils.validate(entry.getValue());
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Map<String, IpRangesJsonGet200ResponseValue> ipRangesJsonGet(Http.Request request) throws Exception;

}
