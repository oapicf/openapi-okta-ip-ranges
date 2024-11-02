/* tslint:disable */
/* eslint-disable */
/**
 * OpenAPI Okta IP Ranges
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * Object containing IP ranges for a specific regional cell
 * @export
 * @interface IpRangesJsonGet200ResponseValue
 */
export interface IpRangesJsonGet200ResponseValue {
    /**
     * 
     * @type {Array<string>}
     * @memberof IpRangesJsonGet200ResponseValue
     */
    ipRanges?: Array<string>;
}

/**
 * Check if a given object implements the IpRangesJsonGet200ResponseValue interface.
 */
export function instanceOfIpRangesJsonGet200ResponseValue(value: object): value is IpRangesJsonGet200ResponseValue {
    return true;
}

export function IpRangesJsonGet200ResponseValueFromJSON(json: any): IpRangesJsonGet200ResponseValue {
    return IpRangesJsonGet200ResponseValueFromJSONTyped(json, false);
}

export function IpRangesJsonGet200ResponseValueFromJSONTyped(json: any, ignoreDiscriminator: boolean): IpRangesJsonGet200ResponseValue {
    if (json == null) {
        return json;
    }
    return {
        
        'ipRanges': json['ip_ranges'] == null ? undefined : json['ip_ranges'],
    };
}

  export function IpRangesJsonGet200ResponseValueToJSON(json: any): IpRangesJsonGet200ResponseValue {
      return IpRangesJsonGet200ResponseValueToJSONTyped(json, false);
  }

  export function IpRangesJsonGet200ResponseValueToJSONTyped(value?: IpRangesJsonGet200ResponseValue | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'ip_ranges': value['ipRanges'],
    };
}

