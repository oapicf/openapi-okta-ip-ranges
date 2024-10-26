namespace OpenAPI
open System.Collections.Generic
open OpenAPI.Model.IpRangesJsonGet200ResponseValue
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open System.Collections.Generic
open System

module DefaultApiServiceImplementation =

    //#region Service implementation
    type DefaultApiServiceImpl() =
      interface IDefaultApiService with

        member this.IpRangesJsonGet () =
            let content = "A JSON object of regional cells with IP ranges." :> obj :?> IDictionary<string, IpRangesJsonGet200ResponseValue> // this cast is obviously wrong, and is only intended to allow generated project to compile   
            IpRangesJsonGetStatusCode200 { content = content }

      //#endregion

    let DefaultApiService = DefaultApiServiceImpl() :> IDefaultApiService