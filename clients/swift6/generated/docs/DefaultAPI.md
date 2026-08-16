# DefaultAPI

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ipRangesJsonGet**](DefaultAPI.md#iprangesjsonget) | **GET** /ip_ranges.json | Retrieve Okta IP ranges


# **ipRangesJsonGet**
```swift
    open class func ipRangesJsonGet(completion: @escaping (_ data: [String: IpRangesJsonGet200ResponseValue]?, _ error: Error?) -> Void)
```

Retrieve Okta IP ranges

Returns IP ranges organized by regional cell names.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Retrieve Okta IP ranges
DefaultAPI.ipRangesJsonGet() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[String: IpRangesJsonGet200ResponseValue]**](IpRangesJsonGet200ResponseValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

