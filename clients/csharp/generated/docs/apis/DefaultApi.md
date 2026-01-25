# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**IpRangesJsonGet**](DefaultApi.md#iprangesjsonget) | **GET** /ip_ranges.json | Retrieve Okta IP ranges |

<a id="iprangesjsonget"></a>
# **IpRangesJsonGet**
> Dictionary&lt;string, IpRangesJsonGet200ResponseValue&gt; IpRangesJsonGet ()

Retrieve Okta IP ranges

Returns IP ranges organized by regional cell names.


### Parameters
This endpoint does not need any parameter.
### Return type

[**Dictionary&lt;string, IpRangesJsonGet200ResponseValue&gt;**](IpRangesJsonGet200ResponseValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object of regional cells with IP ranges. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

