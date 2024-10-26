import unittest

from flask import json

from openapi_server.models.ip_ranges_json_get200_response_value import IpRangesJsonGet200ResponseValue  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_ip_ranges_json_get(self):
        """Test case for ip_ranges_json_get

        Retrieve Okta IP ranges
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/okta-ip-ranges/ip_ranges.json',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
