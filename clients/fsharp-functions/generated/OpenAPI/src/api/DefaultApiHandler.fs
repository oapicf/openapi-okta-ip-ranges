namespace OpenAPI

open DefaultApiHandlerParams
open DefaultApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module DefaultApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region IpRangesJsonGet
    /// <summary>
    /// Retrieve Okta IP ranges
    /// </summary>
   [<FunctionName("IpRangesJsonGet")>]
    let IpRangesJsonGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/okta-ip-ranges/ip_ranges.json")>]
        req:HttpRequest ) =

      let result = DefaultApiService.IpRangesJsonGet ()
      match result with
      | IpRangesJsonGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

