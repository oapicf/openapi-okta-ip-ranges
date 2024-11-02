# coding: utf-8

"""
    OpenAPI Okta IP Ranges

    OpenAPI specification and a set of generated API clients for Okta IP Ranges

    The version of the OpenAPI document: 0.10.1-pre.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from fastapi import FastAPI

from openapi_server.apis.default_api import router as DefaultApiRouter

app = FastAPI(
    title="OpenAPI Okta IP Ranges",
    description="OpenAPI specification and a set of generated API clients for Okta IP Ranges",
    version="0.10.1-pre.0",
)

app.include_router(DefaultApiRouter)
