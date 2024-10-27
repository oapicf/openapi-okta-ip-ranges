# PSOpenAPITools - the PowerShell module for the OpenAPI Okta IP Ranges

OpenAPI specification and a set of generated API clients for Okta IP Ranges

This PowerShell module is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.9.0-pre.0
- SDK version: 0.1.2
- Generator version: 7.6.0
- Build package: org.openapitools.codegen.languages.PowerShellClientCodegen
    For more information, please visit [https://github.com/oapicf/openapi-okta-ip-ranges](https://github.com/oapicf/openapi-okta-ip-ranges)

<a id="frameworks-supported"></a>
## Frameworks supported
- PowerShell 6.2 or later

<a id="dependencies"></a>
## Dependencies

<a id="installation"></a>
## Installation


To install from the source, run the following command to build and install the PowerShell module locally:
```powershell
Build.ps1
Import-Module -Name '.\src\PSOpenAPITools' -Verbose
```

To avoid function name collision, one can use `-Prefix`, e.g. `Import-Module -Name '.\src\PSOpenAPITools' -Prefix prefix`

To uninstall the module, simply run:
```powershell
Remove-Module -FullyQualifiedName @{ModuleName = "PSOpenAPITools"; ModuleVersion = "0.1.2"}
```

<a id="tests"></a>
## Tests

To install and run `Pester`, please execute the following commands in the terminal:

```powershell
Install-module -name Pester -force

Invoke-Pester
```

For troubleshooting, please run `$DebugPreference = 'Continue'` to turn on debugging and disable it with `$DebugPreference = 'SilentlyContinue'` when done with the troubleshooting.

## Documentation for API Endpoints

All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**Invoke-IpRangesJsonGet**](docs/DefaultApi.md#Invoke-IpRangesJsonGet) | **GET** /ip_ranges.json | Retrieve Okta IP ranges


## Documentation for Models

 - [PSOpenAPITools\Model.IpRangesJsonGet200ResponseValue](docs/IpRangesJsonGet200ResponseValue.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.
