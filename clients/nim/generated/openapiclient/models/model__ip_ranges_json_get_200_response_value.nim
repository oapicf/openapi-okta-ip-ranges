#
# OpenAPI Okta IP Ranges
# 
# OpenAPI specification and a set of generated API clients for Okta IP Ranges
# The version of the OpenAPI document: 1.0.1-pre.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import json
import tables


type IpRangesJsonGet200ResponseValue* = object
  ## Object containing IP ranges for a specific regional cell
  ipRanges*: seq[string]
