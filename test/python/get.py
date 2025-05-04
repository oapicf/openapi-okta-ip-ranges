import unittest
import openapioktaipranges
from openapioktaipranges.models.ip_ranges_json_get200_response_value import IpRangesJsonGet200ResponseValue
from openapioktaipranges.rest import ApiException
from pprint import pprint

class TestGet(unittest.TestCase):

    def test_retrieve_okta_ip_ranges(self):

        configuration = openapioktaipranges.Configuration(
            host = "https://s3.amazonaws.com/okta-ip-ranges"
        )

        with openapioktaipranges.ApiClient(configuration) as api_client:
            api_instance = openapioktaipranges.DefaultApi(api_client)

            try:
                api_response = api_instance.ip_ranges_json_get()
                print('Okta cells:');
                pprint(api_response.keys())
                print('apac_cell_1' in api_response)
                cell_names = [
                    'apac_cell_2',
                    'emea_cell_2',
                    'emea_pam_cell_1',
                    'preview_cell_3',
                    'preview_pam_cell_1',
                    'us_cell_14',
                    'us_pam_cell_1'
                ]
                for cell in cell_names:
                    self.assertTrue(cell in api_response)
                    self.assertTrue(len(api_response[cell].ip_ranges) >= 1)
            except Exception as e:
                self.fail("Exception when calling DefaultApi->ip_ranges_json_get: %s\n" % e)
