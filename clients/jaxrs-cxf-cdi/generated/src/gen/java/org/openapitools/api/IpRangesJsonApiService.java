package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.IpRangesJsonGet200ResponseValue;
import java.util.Map;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2025-05-10T05:06:45.741115979Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public interface IpRangesJsonApiService {
      public Response ipRangesJsonGet(SecurityContext securityContext);
}
