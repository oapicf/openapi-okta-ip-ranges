#
# OpenAPI Okta IP Ranges
# 
# OpenAPI specification and a set of generated API clients for Okta IP Ranges
# The version of the OpenAPI document: 0.9.0-pre.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import httpclient
import json
import logging
import marshal
import options
import strformat
import strutils
import tables
import typetraits
import uri

import ../models/model__ip_ranges_json_get_200_response_value

const basepath = "https://s3.amazonaws.com/okta-ip-ranges"

template constructResult[T](response: Response): untyped =
  if response.code in {Http200, Http201, Http202, Http204, Http206}:
    try:
      when name(stripGenericParams(T.typedesc).typedesc) == name(Table):
        (some(json.to(parseJson(response.body), T.typedesc)), response)
      else:
        (some(marshal.to[T](response.body)), response)
    except JsonParsingError:
      # The server returned a malformed response though the response code is 2XX
      # TODO: need better error handling
      error("JsonParsingError")
      (none(T.typedesc), response)
  else:
    (none(T.typedesc), response)


proc ipRangesJsonGet*(httpClient: HttpClient): (Option[Table[string, _ip_ranges_json_get_200_response_value]], Response) =
  ## Retrieve Okta IP ranges

  let response = httpClient.get(basepath & "/ip_ranges.json")
  constructResult[Table[string, _ip_ranges_json_get_200_response_value]](response)
