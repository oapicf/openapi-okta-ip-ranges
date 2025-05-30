# open_api_okta_ip_ranges

OpenApiOktaIpRanges - JavaScript client for open_api_okta_ip_ranges
OpenAPI specification and a set of generated API clients for Okta IP Ranges
This SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.1-pre.0
- Package version: 1.0.1-pre.0
- Generator version: 7.12.0
- Build package: org.openapitools.codegen.languages.JavascriptApolloClientCodegen
For more information, please visit [https://github.com/oapicf/openapi-okta-ip-ranges](https://github.com/oapicf/openapi-okta-ip-ranges)

## Installation

### For [Node.js](https://nodejs.org/)

#### npm

To publish the library as a [npm](https://www.npmjs.com/), please follow the procedure in ["Publishing npm packages"](https://docs.npmjs.com/getting-started/publishing-npm-packages).

Then install it via:

```shell
npm install open_api_okta_ip_ranges --save
```

Finally, you need to build the module:

```shell
npm run build
```

##### Local development

To use the library locally without publishing to a remote npm registry, first install the dependencies by changing into the directory containing `package.json` (and this README). Let's call this `JAVASCRIPT_CLIENT_DIR`. Then run:

```shell
npm install
```

Next, [link](https://docs.npmjs.com/cli/link) it globally in npm with the following, also from `JAVASCRIPT_CLIENT_DIR`:

```shell
npm link
```

To use the link you just defined in your project, switch to the directory you want to use your open_api_okta_ip_ranges from, and run:

```shell
npm link /path/to/<JAVASCRIPT_CLIENT_DIR>
```

Finally, you need to build the module:

```shell
npm run build
```

#### git

If the library is hosted at a git repository, e.g.https://github.com/oapicf/openapi-okta-ip-ranges
then install it via:

```shell
    npm install oapicf/openapi-okta-ip-ranges --save
```

### For browser

The library also works in the browser environment via npm and [browserify](http://browserify.org/). After following
the above steps with Node.js and installing browserify with `npm install -g browserify`,
perform the following (assuming *main.js* is your entry file):

```shell
browserify main.js > bundle.js
```

Then include *bundle.js* in the HTML pages.

### Webpack Configuration

Using Webpack you may encounter the following error: "Module not found: Error:
Cannot resolve module", most certainly you should disable AMD loader. Add/merge
the following section to your webpack config:

```javascript
module: {
  rules: [
    {
      parser: {
        amd: false
      }
    }
  ]
}
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following JS code:

```javascript
var OpenApiOktaIpRanges = require('open_api_okta_ip_ranges');


var api = new OpenApiOktaIpRanges.DefaultApi()
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.ipRangesJsonGet(callback);

```

## Documentation for API Endpoints

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OpenApiOktaIpRanges.DefaultApi* | [**ipRangesJsonGet**](docs/DefaultApi.md#ipRangesJsonGet) | **GET** /ip_ranges.json | Retrieve Okta IP ranges


## Documentation for Models

 - [OpenApiOktaIpRanges.IpRangesJsonGet200ResponseValue](docs/IpRangesJsonGet200ResponseValue.md)


## Documentation for Authorization

Endpoints do not require authorization.

