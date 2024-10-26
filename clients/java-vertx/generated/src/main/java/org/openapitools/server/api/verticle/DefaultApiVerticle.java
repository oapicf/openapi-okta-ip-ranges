package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.IpRangesJsonGet200ResponseValue;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class DefaultApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(DefaultApiVerticle.class);

    static final String GET_IP_RANGES.JSON_SERVICE_ID = "GET_ip_ranges.json";
    
    final DefaultApi service;

    public DefaultApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.DefaultApiImpl");
            service = (DefaultApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("DefaultApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for GET_ip_ranges.json
        vertx.eventBus().<JsonObject> consumer(GET_IP_RANGES.JSON_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GET_ip_ranges.json";
                service.ipRangesJsonGet(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GET_ip_ranges.json");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GET_ip_ranges.json", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
