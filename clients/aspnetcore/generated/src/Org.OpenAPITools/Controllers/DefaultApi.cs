/*
 * OpenAPI Okta IP Ranges
 *
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * The version of the OpenAPI document: 1.0.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Http;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using Org.OpenAPITools.Attributes;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class DefaultApiController : ControllerBase
    { 
        /// <summary>
        /// Retrieve Okta IP ranges
        /// </summary>
        /// <remarks>Returns IP ranges organized by regional cell names.</remarks>
        /// <response code="200">A JSON object of regional cells with IP ranges.</response>
        [HttpGet]
        [Route("/okta-ip-ranges/ip_ranges.json")]
        [ValidateModelState]
        [SwaggerOperation("IpRangesJsonGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(Dictionary<string, IpRangesJsonGet200ResponseValue>), description: "A JSON object of regional cells with IP ranges.")]
        public virtual IActionResult IpRangesJsonGet()
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Dictionary<string, IpRangesJsonGet200ResponseValue>));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Dictionary<string, IpRangesJsonGet200ResponseValue>>(exampleJson)
            : new Dictionary<string, IpRangesJsonGet200ResponseValue>();
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
