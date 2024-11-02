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


import type { Configuration } from './configuration';
import type { AxiosPromise, AxiosInstance, RawAxiosRequestConfig } from 'axios';
import globalAxios from 'axios';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from './common';
import type { RequestArgs } from './base';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, BaseAPI, RequiredError, operationServerMap } from './base';

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
    'ip_ranges'?: Array<string>;
}

/**
 * DefaultApi - axios parameter creator
 * @export
 */
export const DefaultApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Returns IP ranges organized by regional cell names.
         * @summary Retrieve Okta IP ranges
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        ipRangesJsonGet: async (options: RawAxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/ip_ranges.json`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * DefaultApi - functional programming interface
 * @export
 */
export const DefaultApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = DefaultApiAxiosParamCreator(configuration)
    return {
        /**
         * Returns IP ranges organized by regional cell names.
         * @summary Retrieve Okta IP ranges
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async ipRangesJsonGet(options?: RawAxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<{ [key: string]: IpRangesJsonGet200ResponseValue; }>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.ipRangesJsonGet(options);
            const localVarOperationServerIndex = configuration?.serverIndex ?? 0;
            const localVarOperationServerBasePath = operationServerMap['DefaultApi.ipRangesJsonGet']?.[localVarOperationServerIndex]?.url;
            return (axios, basePath) => createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration)(axios, localVarOperationServerBasePath || basePath);
        },
    }
};

/**
 * DefaultApi - factory interface
 * @export
 */
export const DefaultApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = DefaultApiFp(configuration)
    return {
        /**
         * Returns IP ranges organized by regional cell names.
         * @summary Retrieve Okta IP ranges
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        ipRangesJsonGet(options?: RawAxiosRequestConfig): AxiosPromise<{ [key: string]: IpRangesJsonGet200ResponseValue; }> {
            return localVarFp.ipRangesJsonGet(options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * DefaultApi - object-oriented interface
 * @export
 * @class DefaultApi
 * @extends {BaseAPI}
 */
export class DefaultApi extends BaseAPI {
    /**
     * Returns IP ranges organized by regional cell names.
     * @summary Retrieve Okta IP ranges
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public ipRangesJsonGet(options?: RawAxiosRequestConfig) {
        return DefaultApiFp(this.configuration).ipRangesJsonGet(options).then((request) => request(this.axios, this.basePath));
    }
}



