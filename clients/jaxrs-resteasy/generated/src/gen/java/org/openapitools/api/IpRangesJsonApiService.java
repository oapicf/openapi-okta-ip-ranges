package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.IpRangesJsonGet200ResponseValue;
import java.util.Map;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-10-26T04:03:14.132949016Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public interface IpRangesJsonApiService {
      Response ipRangesJsonGet(SecurityContext securityContext)
      throws NotFoundException;
}
