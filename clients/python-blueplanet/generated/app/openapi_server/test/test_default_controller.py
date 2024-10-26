# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.ip_ranges_json_get200_response_value import IpRangesJsonGet200ResponseValue  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_ip_ranges_json_get(self):
        """Test case for ip_ranges_json_get

        Retrieve Okta IP ranges
        """
        response = self.client.open(
            '/okta-ip-ranges/ip_ranges.json',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
