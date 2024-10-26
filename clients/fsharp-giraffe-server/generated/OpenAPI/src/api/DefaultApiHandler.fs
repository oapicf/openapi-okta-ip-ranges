namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open DefaultApiServiceImplementation
open System.Collections.Generic
open OpenAPI.Model.IpRangesJsonGet200ResponseValue

module DefaultApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region IpRangesJsonGet
    /// <summary>
    /// Retrieve Okta IP ranges
    /// </summary>

    let IpRangesJsonGet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = DefaultApiService.IpRangesJsonGet ctx 
          return! (match result with
                      | IpRangesJsonGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

