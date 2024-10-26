# org.openapitools - Kotlin Server library for OpenAPI Okta IP Ranges

## Requires

* Kotlin 1.3.10
* Maven 3.3

## Build

```
mvn clean package
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**ipRangesJsonGet**](docs/DefaultApi.md#iprangesjsonget) | **GET** /ip_ranges.json | Retrieve Okta IP ranges


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.server.api.model.IpRangesJsonGet200ResponseValue](docs/IpRangesJsonGet200ResponseValue.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.

