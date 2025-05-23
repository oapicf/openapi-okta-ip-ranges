# openapi (EXPERIMENTAL)
OpenAPI specification and a set of generated API clients for Okta IP Ranges

This Dart package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.1-pre.0
- Generator version: 7.12.0
- Build package: org.openapitools.codegen.languages.DartDioClientCodegen
For more information, please visit [https://github.com/oapicf/openapi-okta-ip-ranges](https://github.com/oapicf/openapi-okta-ip-ranges)

## Requirements

* Dart 2.15.0+ or Flutter 2.8.0+
* Dio 5.0.0+ (https://pub.dev/packages/dio)

## Installation & Usage

### pub.dev
To use the package from [pub.dev](https://pub.dev), please include the following in pubspec.yaml
```yaml
dependencies:
  openapi: 1.0.0
```

### Github
If this Dart package is published to Github, please include the following in pubspec.yaml
```yaml
dependencies:
  openapi:
    git:
      url: https://github.com/oapicf/openapi-okta-ip-ranges.git
      #ref: main
```

### Local development
To use the package from your local drive, please include the following in pubspec.yaml
```yaml
dependencies:
  openapi:
    path: /path/to/openapi
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```dart
import 'package:openapi/openapi.dart';


final api = Openapi().getDefaultApi();

try {
    final response = await api.ipRangesJsonGet();
    print(response);
} catch on DioException (e) {
    print("Exception when calling DefaultApi->ipRangesJsonGet: $e\n");
}

```

## Documentation for API Endpoints

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
[*DefaultApi*](doc/DefaultApi.md) | [**ipRangesJsonGet**](doc/DefaultApi.md#iprangesjsonget) | **GET** /ip_ranges.json | Retrieve Okta IP ranges


## Documentation For Models

 - [IpRangesJsonGet200ResponseValue](doc/IpRangesJsonGet200ResponseValue.md)


## Documentation For Authorization

Endpoints do not require authorization.


## Author

blah+oapicf@cliffano.com

