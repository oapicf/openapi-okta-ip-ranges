from typing import List, Dict
from aiohttp import web

from openapi_server.models.ip_ranges_json_get200_response_value import IpRangesJsonGet200ResponseValue
from openapi_server import util


async def ip_ranges_json_get(request: web.Request, ) -> web.Response:
    """Retrieve Okta IP ranges

    Returns IP ranges organized by regional cell names.


    """
    return web.Response(status=200)
