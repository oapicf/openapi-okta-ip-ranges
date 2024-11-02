package org.openapitools.api;

import org.openapitools.api.IpRangesJsonApiService;
import org.openapitools.api.factories.IpRangesJsonApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.IpRangesJsonGet200ResponseValue;
import java.util.Map;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/ip_ranges.json")


@io.swagger.annotations.Api(description = "the ip_ranges.json API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-02T00:27:44.200285935Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IpRangesJsonApi  {
   private final IpRangesJsonApiService delegate;

   public IpRangesJsonApi(@Context ServletConfig servletContext) {
      IpRangesJsonApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("IpRangesJsonApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (IpRangesJsonApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = IpRangesJsonApiServiceFactory.getIpRangesJsonApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve Okta IP ranges", notes = "Returns IP ranges organized by regional cell names.", response = IpRangesJsonGet200ResponseValue.class, responseContainer = "Map", tags={  })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "A JSON object of regional cells with IP ranges.", response = IpRangesJsonGet200ResponseValue.class, responseContainer = "Map")
    })
    public Response ipRangesJsonGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.ipRangesJsonGet(securityContext);
    }
}
