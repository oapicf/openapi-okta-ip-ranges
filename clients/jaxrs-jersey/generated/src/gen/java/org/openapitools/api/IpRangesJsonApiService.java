package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.IpRangesJsonGet200ResponseValue;
import java.util.Map;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-10-26T04:03:07.497615236Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public abstract class IpRangesJsonApiService {
    public abstract Response ipRangesJsonGet(SecurityContext securityContext) throws NotFoundException;
}
