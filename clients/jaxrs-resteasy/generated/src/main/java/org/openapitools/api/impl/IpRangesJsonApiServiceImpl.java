package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.IpRangesJsonGet200ResponseValue;
import java.util.Map;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-10-26T04:03:14.132949016Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class IpRangesJsonApiServiceImpl implements IpRangesJsonApiService {
      public Response ipRangesJsonGet(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}