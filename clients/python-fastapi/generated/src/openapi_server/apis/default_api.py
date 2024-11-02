# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.default_api_base import BaseDefaultApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.models.ip_ranges_json_get200_response_value import IpRangesJsonGet200ResponseValue


router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ip_ranges.json",
    responses={
        200: {"model": Dict[str, IpRangesJsonGet200ResponseValue], "description": "A JSON object of regional cells with IP ranges."},
    },
    tags=["default"],
    summary="Retrieve Okta IP ranges",
    response_model_by_alias=True,
)
async def ip_ranges_json_get(
) -> Dict[str, IpRangesJsonGet200ResponseValue]:
    """Returns IP ranges organized by regional cell names."""
    if not BaseDefaultApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseDefaultApi.subclasses[0]().ip_ranges_json_get()
