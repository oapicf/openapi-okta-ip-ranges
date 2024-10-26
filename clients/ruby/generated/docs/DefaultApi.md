# OpenApiIplocationClient::DefaultApi

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ip_ranges_json_get**](DefaultApi.md#ip_ranges_json_get) | **GET** /ip_ranges.json | Retrieve Okta IP ranges |


## ip_ranges_json_get

> <Hash<String, IpRangesJsonGet200ResponseValue>> ip_ranges_json_get

Retrieve Okta IP ranges

Returns IP ranges organized by regional cell names.

### Examples

```ruby
require 'time'
require 'openapi_okta_ip_ranges'

api_instance = OpenApiIplocationClient::DefaultApi.new

begin
  # Retrieve Okta IP ranges
  result = api_instance.ip_ranges_json_get
  p result
rescue OpenApiIplocationClient::ApiError => e
  puts "Error when calling DefaultApi->ip_ranges_json_get: #{e}"
end
```

#### Using the ip_ranges_json_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Hash<String, IpRangesJsonGet200ResponseValue>>, Integer, Hash)> ip_ranges_json_get_with_http_info

```ruby
begin
  # Retrieve Okta IP ranges
  data, status_code, headers = api_instance.ip_ranges_json_get_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Hash<String, IpRangesJsonGet200ResponseValue>>
rescue OpenApiIplocationClient::ApiError => e
  puts "Error when calling DefaultApi->ip_ranges_json_get_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Hash&lt;String, IpRangesJsonGet200ResponseValue&gt;**](IpRangesJsonGet200ResponseValue.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

