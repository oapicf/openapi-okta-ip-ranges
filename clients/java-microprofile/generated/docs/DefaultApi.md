# DefaultApi

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ipRangesJsonGet**](DefaultApi.md#ipRangesJsonGet) | **GET** /ip_ranges.json | Retrieve Okta IP ranges |



## ipRangesJsonGet

> Map&lt;String, IpRangesJsonGet200ResponseValue&gt; ipRangesJsonGet()

Retrieve Okta IP ranges

Returns IP ranges organized by regional cell names.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.models.*;
import org.openapitools.server.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://s3.amazonaws.com/okta-ip-ranges");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            Map<String, IpRangesJsonGet200ResponseValue> result = apiInstance.ipRangesJsonGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#ipRangesJsonGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Map&lt;String, IpRangesJsonGet200ResponseValue&gt;**](IpRangesJsonGet200ResponseValue.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object of regional cells with IP ranges. |  -  |

