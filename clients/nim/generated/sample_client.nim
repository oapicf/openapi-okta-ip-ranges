#
# OpenAPI Okta IP Ranges
# 
# OpenAPI specification and a set of generated API clients for Okta IP Ranges
# The version of the OpenAPI document: 0.10.1-pre.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import httpclient
import logging
import options

import openapiclient

import config

let logger = newConsoleLogger()
addHandler(logger)

let client = newHttpClient()
client.headers["User-Agent"] = config.useragent
