# PSOpenAPITools.PSOpenAPITools\Api.DefaultApi

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-IpRangesJsonGet**](DefaultApi.md#Invoke-IpRangesJsonGet) | **GET** /ip_ranges.json | Retrieve Okta IP ranges


<a id="Invoke-IpRangesJsonGet"></a>
# **Invoke-IpRangesJsonGet**
> System.Collections.Hashtable Invoke-IpRangesJsonGet<br>

Retrieve Okta IP ranges

Returns IP ranges organized by regional cell names.

### Example
```powershell

# Retrieve Okta IP ranges
try {
    $Result = Invoke-IpRangesJsonGet
} catch {
    Write-Host ("Exception occurred when calling Invoke-IpRangesJsonGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**System.Collections.Hashtable**](IpRangesJsonGet200ResponseValue.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

