# DefaultApi

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**ipRangesJsonGet**](#iprangesjsonget) | **GET** /ip_ranges.json | Retrieve Okta IP ranges|

# **ipRangesJsonGet**
> { [key: string]: IpRangesJsonGet200ResponseValue; } ipRangesJsonGet()

Returns IP ranges organized by regional cell names.

### Example

```typescript
import {
    DefaultApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new DefaultApi(configuration);

const { status, data } = await apiInstance.ipRangesJsonGet();
```

### Parameters
This endpoint does not have any parameters.


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
|**200** | A JSON object of regional cells with IP ranges. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

