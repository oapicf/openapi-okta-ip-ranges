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
using System.IO;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc.Formatters;

namespace Org.OpenAPITools.Formatters
{
    /// <inheritdoc />
    public class InputFormatterStream : InputFormatter
    {
        /// <inheritdoc />
        public InputFormatterStream()
        {
            SupportedMediaTypes.Add("application/octet-stream");
            SupportedMediaTypes.Add("image/jpeg");
        }

        /// <inheritdoc />
        public override Task<InputFormatterResult> ReadRequestBodyAsync(InputFormatterContext context)
        {
            return InputFormatterResult.SuccessAsync(context.HttpContext.Request.Body);
        }

        /// <inheritdoc />
        protected override bool CanReadType(Type type)
        {
            if (type == typeof(Stream))
            {
                return true;
            }

            return false;
        }
    }
}