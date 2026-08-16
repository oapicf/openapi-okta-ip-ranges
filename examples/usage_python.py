import openapioktaipranges
from openapioktaipranges.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://s3.amazonaws.com/okta-ip-ranges
# See configuration.py for a list of all supported configuration parameters.
configuration = openapioktaipranges.Configuration(
    host = "https://s3.amazonaws.com/okta-ip-ranges"
)

# Enter a context with an instance of the API client
with openapioktaipranges.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapioktaipranges.DefaultApi(api_client)

    try:
        # Get Okta IP ranges
        api_response = api_instance.ip_ranges_json_get()
        print("The response of DefaultApi->ip_ranges_json_get:\n")
        print('Okta cells:')
        pprint(api_response.keys())
    except ApiException as e:
        print("Exception when calling DefaultApi->ip_ranges_json_get: %s\n" % e)
        raise
