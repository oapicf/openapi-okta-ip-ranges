# \DefaultAPI

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Method | HTTP request | Description
------------- | ------------- | -------------
[**IpRangesJsonGet**](DefaultAPI.md#IpRangesJsonGet) | **Get** /ip_ranges.json | Retrieve Okta IP ranges



## IpRangesJsonGet

> map[string]IpRangesJsonGet200ResponseValue IpRangesJsonGet(ctx).Execute()

Retrieve Okta IP ranges



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-okta-ip-ranges"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DefaultAPI.IpRangesJsonGet(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DefaultAPI.IpRangesJsonGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `IpRangesJsonGet`: map[string]IpRangesJsonGet200ResponseValue
	fmt.Fprintf(os.Stdout, "Response from `DefaultAPI.IpRangesJsonGet`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiIpRangesJsonGetRequest struct via the builder pattern


### Return type

[**map[string]IpRangesJsonGet200ResponseValue**](IpRangesJsonGet200ResponseValue.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

