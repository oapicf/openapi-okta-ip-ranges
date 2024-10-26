namespace OpenAPI

open System.Collections.Generic
open OpenAPI.Model.IpRangesJsonGet200ResponseValue
open System.Collections.Generic
open System

module DefaultApiHandlerParams =



    type IpRangesJsonGetStatusCode200Response = {
      content:IDictionary<string, IpRangesJsonGet200ResponseValue>;
      
    }
    type IpRangesJsonGetResult = IpRangesJsonGetStatusCode200 of IpRangesJsonGetStatusCode200Response

