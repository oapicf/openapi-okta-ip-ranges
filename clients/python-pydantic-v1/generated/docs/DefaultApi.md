# openapi_client.DefaultApi

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ip_ranges_json_get**](DefaultApi.md#ip_ranges_json_get) | **GET** /ip_ranges.json | Retrieve Okta IP ranges


# **ip_ranges_json_get**
> Dict[str, IpRangesJsonGet200ResponseValue] ip_ranges_json_get()

Retrieve Okta IP ranges

Returns IP ranges organized by regional cell names.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.ip_ranges_json_get200_response_value import IpRangesJsonGet200ResponseValue
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://s3.amazonaws.com/okta-ip-ranges
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://s3.amazonaws.com/okta-ip-ranges"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)

    try:
        # Retrieve Okta IP ranges
        api_response = api_instance.ip_ranges_json_get()
        print("The response of DefaultApi->ip_ranges_json_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->ip_ranges_json_get: %s\n" % e)
```



### Parameters
This endpoint does not need any parameter.

### Return type

[**Dict[str, IpRangesJsonGet200ResponseValue]**](IpRangesJsonGet200ResponseValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A JSON object of regional cells with IP ranges. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

