using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Functions
{ 
    public partial class DefaultApi
    { 
        [FunctionName("DefaultApi_IpRangesJsonGet")]
        public async Task<ActionResult<Dictionary<string, IpRangesJsonGet200ResponseValue>>> _IpRangesJsonGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "okta-ip-rangesip_ranges.json")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("IpRangesJsonGet");
            return method != null
                ? (await ((Task<Dictionary<string, IpRangesJsonGet200ResponseValue>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
