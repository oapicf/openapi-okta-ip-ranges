# OpenApiOktaIpRanges.DefaultApi

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ipRangesJsonGet**](DefaultApi.md#ipRangesJsonGet) | **GET** /ip_ranges.json | Retrieve Okta IP ranges



## ipRangesJsonGet

> {String: IpRangesJsonGet200ResponseValue} ipRangesJsonGet()

Retrieve Okta IP ranges

Returns IP ranges organized by regional cell names.

### Example

```javascript
import OpenApiOktaIpRanges from 'open_api_okta_ip_ranges';

let apiInstance = new OpenApiOktaIpRanges.DefaultApi();
apiInstance.ipRangesJsonGet((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**{String: IpRangesJsonGet200ResponseValue}**](IpRangesJsonGet200ResponseValue.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

