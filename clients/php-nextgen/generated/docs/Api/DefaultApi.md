# OpenAPI\Client\DefaultApi

All URIs are relative to https://s3.amazonaws.com/okta-ip-ranges, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ipRangesJsonGet()**](DefaultApi.md#ipRangesJsonGet) | **GET** /ip_ranges.json | Retrieve Okta IP ranges |


## `ipRangesJsonGet()`

```php
ipRangesJsonGet(): array<string,\OpenAPI\Client\Model\IpRangesJsonGet200ResponseValue>
```

Retrieve Okta IP ranges

Returns IP ranges organized by regional cell names.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->ipRangesJsonGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->ipRangesJsonGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**array<string,\OpenAPI\Client\Model\IpRangesJsonGet200ResponseValue>**](../Model/IpRangesJsonGet200ResponseValue.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
