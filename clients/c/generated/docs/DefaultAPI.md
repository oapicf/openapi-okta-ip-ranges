# DefaultAPI

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DefaultAPI_ipRangesJsonGet**](DefaultAPI.md#DefaultAPI_ipRangesJsonGet) | **GET** /ip_ranges.json | Retrieve Okta IP ranges


# **DefaultAPI_ipRangesJsonGet**
```c
// Retrieve Okta IP ranges
//
// Returns IP ranges organized by regional cell names.
//
list_t*_t* DefaultAPI_ipRangesJsonGet(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

[list_t*_t](_ip_ranges_json_get_200_response_value.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

