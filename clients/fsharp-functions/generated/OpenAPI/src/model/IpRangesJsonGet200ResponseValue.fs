namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module IpRangesJsonGet200ResponseValue =

  //#region IpRangesJsonGet200ResponseValue

  [<CLIMutable>]
  type IpRangesJsonGet200ResponseValue = {
    [<JsonProperty(PropertyName = "ip_ranges")>]
    IpRanges : string[];
  }

  //#endregion
