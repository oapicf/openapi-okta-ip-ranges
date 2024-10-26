# DefaultApi

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Method | HTTP request | Description
------------- | ------------- | -------------
[**IpRangesJsonGet**](DefaultApi.md#IpRangesJsonGet) | **GET** /ip_ranges.json | Retrieve Okta IP ranges


# **IpRangesJsonGet**
> map(IpRangesJsonGet200ResponseValue) IpRangesJsonGet()

Retrieve Okta IP ranges

Returns IP ranges organized by regional cell names.

### Example
```R
library(openapi)

# Retrieve Okta IP ranges
#

api_instance <- DefaultApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$IpRangesJsonGet(data_file = "result.txt")
result <- api_instance$IpRangesJsonGet()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**map(IpRangesJsonGet200ResponseValue)**](_ip_ranges_json_get_200_response_value.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object of regional cells with IP ranges. |  -  |

