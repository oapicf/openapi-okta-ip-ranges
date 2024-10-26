# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.ip_ranges_json_get200_response_value import IpRangesJsonGet200ResponseValue  # noqa: F401


def test_ip_ranges_json_get(client: TestClient):
    """Test case for ip_ranges_json_get

    Retrieve Okta IP ranges
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ip_ranges.json",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

