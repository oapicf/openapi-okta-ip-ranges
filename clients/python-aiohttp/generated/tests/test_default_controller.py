# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.ip_ranges_json_get200_response_value import IpRangesJsonGet200ResponseValue


pytestmark = pytest.mark.asyncio

async def test_ip_ranges_json_get(client):
    """Test case for ip_ranges_json_get

    Retrieve Okta IP ranges
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/okta-ip-ranges/ip_ranges.json',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

