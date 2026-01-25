# .DefaultApi

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ipRangesJsonGet**](DefaultApi.md#ipRangesJsonGet) | **GET** /ip_ranges.json | Retrieve Okta IP ranges


# **ipRangesJsonGet**
> { [key: string]: IpRangesJsonGet200ResponseValue; } ipRangesJsonGet()

Returns IP ranges organized by regional cell names.

### Example


```typescript
import { createConfiguration, DefaultApi } from '';

const configuration = createConfiguration();
const apiInstance = new DefaultApi(configuration);

const request = {};

const data = await apiInstance.ipRangesJsonGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**{ [key: string]: IpRangesJsonGet200ResponseValue; }**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A JSON object of regional cells with IP ranges. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


