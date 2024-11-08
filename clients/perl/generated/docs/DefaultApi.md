# WWW::OpenAPIClient::DefaultApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::DefaultApi;
```

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ip_ranges_json_get**](DefaultApi.md#ip_ranges_json_get) | **GET** /ip_ranges.json | Retrieve Okta IP ranges


# **ip_ranges_json_get**
> HASH[string,IpRangesJsonGet200ResponseValue] ip_ranges_json_get()

Retrieve Okta IP ranges

Returns IP ranges organized by regional cell names.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);


eval {
    my $result = $api_instance->ip_ranges_json_get();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->ip_ranges_json_get: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HASH[string,IpRangesJsonGet200ResponseValue]**](IpRangesJsonGet200ResponseValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

