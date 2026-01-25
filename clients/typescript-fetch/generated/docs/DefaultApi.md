# DefaultApi

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ipRangesJsonGet**](DefaultApi.md#iprangesjsonget) | **GET** /ip_ranges.json | Retrieve Okta IP ranges |



## ipRangesJsonGet

> { [key: string]: IpRangesJsonGet200ResponseValue; } ipRangesJsonGet()

Retrieve Okta IP ranges

Returns IP ranges organized by regional cell names.

### Example

```ts
import {
  Configuration,
  DefaultApi,
} from '';
import type { IpRangesJsonGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new DefaultApi();

  try {
    const data = await api.ipRangesJsonGet();
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**{ [key: string]: IpRangesJsonGet200ResponseValue; }**](IpRangesJsonGet200ResponseValue.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object of regional cells with IP ranges. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

