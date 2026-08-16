# DefaultApi

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ipRangesJsonGet**](DefaultApi.md#ipRangesJsonGet) | **Get** /ip_ranges.json | Retrieve Okta IP ranges


<a name="ipRangesJsonGet"></a>
# **ipRangesJsonGet**
> kotlin.collections.Map&lt;kotlin.String, IpRangesJsonGet200ResponseValue&gt; ipRangesJsonGet()

Retrieve Okta IP ranges

Returns IP ranges organized by regional cell names.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.collections.Map<kotlin.String, IpRangesJsonGet200ResponseValue> = apiInstance.ipRangesJsonGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#ipRangesJsonGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#ipRangesJsonGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.Map&lt;kotlin.String, IpRangesJsonGet200ResponseValue&gt;**](IpRangesJsonGet200ResponseValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

