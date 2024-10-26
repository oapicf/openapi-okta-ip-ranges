# DefaultController

All URIs are relative to `"/okta-ip-ranges"`

The controller class is defined in **[DefaultController.java](../../src/main/java/org/openapitools/controller/DefaultController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**ipRangesJsonGet**](#ipRangesJsonGet) | **GET** /ip_ranges.json | Retrieve Okta IP ranges

<a id="ipRangesJsonGet"></a>
# **ipRangesJsonGet**
```java
Mono<Map<String, IpRangesJsonGet200ResponseValue>> DefaultController.ipRangesJsonGet()
```

Retrieve Okta IP ranges

Returns IP ranges organized by regional cell names.


### Return type
[**Map&lt;String, IpRangesJsonGet200ResponseValue&gt;**](../../docs/models/IpRangesJsonGet200ResponseValue.md)


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

