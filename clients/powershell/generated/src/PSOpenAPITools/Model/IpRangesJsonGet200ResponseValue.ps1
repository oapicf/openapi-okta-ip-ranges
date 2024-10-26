#
# OpenAPI Okta IP Ranges
# OpenAPI specification and a set of generated API clients for Okta IP Ranges
# Version: 0.9.0-pre.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

Object containing IP ranges for a specific regional cell

.PARAMETER IpRanges
No description available.
.OUTPUTS

IpRangesJsonGet200ResponseValue<PSCustomObject>
#>

function Initialize-IpRangesJsonGet200ResponseValue {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${IpRanges}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => IpRangesJsonGet200ResponseValue' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "ip_ranges" = ${IpRanges}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to IpRangesJsonGet200ResponseValue<PSCustomObject>

.DESCRIPTION

Convert from JSON to IpRangesJsonGet200ResponseValue<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

IpRangesJsonGet200ResponseValue<PSCustomObject>
#>
function ConvertFrom-JsonToIpRangesJsonGet200ResponseValue {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => IpRangesJsonGet200ResponseValue' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in IpRangesJsonGet200ResponseValue
        $AllProperties = ("ip_ranges")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "ip_ranges"))) { #optional property not found
            $IpRanges = $null
        } else {
            $IpRanges = $JsonParameters.PSobject.Properties["ip_ranges"].value
        }

        $PSO = [PSCustomObject]@{
            "ip_ranges" = ${IpRanges}
        }

        return $PSO
    }

}

