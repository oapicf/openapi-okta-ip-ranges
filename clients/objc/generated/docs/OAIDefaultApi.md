# OAIDefaultApi

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ipRangesJsonGet**](OAIDefaultApi.md#iprangesjsonget) | **GET** /ip_ranges.json | Retrieve Okta IP ranges


# **ipRangesJsonGet**
```objc
-(NSURLSessionTask*) ipRangesJsonGetWithCompletionHandler: 
        (void (^)(NSDictionary<OAIIpRangesJsonGet200ResponseValue>* output, NSError* error)) handler;
```

Retrieve Okta IP ranges

Returns IP ranges organized by regional cell names.

### Example
```objc


OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// Retrieve Okta IP ranges
[apiInstance ipRangesJsonGetWithCompletionHandler: 
          ^(NSDictionary<OAIIpRangesJsonGet200ResponseValue>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->ipRangesJsonGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSDictionary<OAIIpRangesJsonGet200ResponseValue>***](OAIIpRangesJsonGet200ResponseValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

