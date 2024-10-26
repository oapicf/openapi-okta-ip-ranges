# DefaultApi

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ip_ranges_json_get**](DefaultApi.md#ip_ranges_json_get) | **GET** /ip_ranges.json | Retrieve Okta IP ranges


# **ip_ranges_json_get**
> ip_ranges_json_get(_api::DefaultApi; _mediaType=nothing) -> Dict{String, IpRangesJsonGet200ResponseValue}, OpenAPI.Clients.ApiResponse <br/>
> ip_ranges_json_get(_api::DefaultApi, response_stream::Channel; _mediaType=nothing) -> Channel{ Dict{String, IpRangesJsonGet200ResponseValue} }, OpenAPI.Clients.ApiResponse

Retrieve Okta IP ranges

Returns IP ranges organized by regional cell names.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Dict{String, IpRangesJsonGet200ResponseValue}**](IpRangesJsonGet200ResponseValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

