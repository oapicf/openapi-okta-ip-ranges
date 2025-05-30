/**
 * OpenAPI Okta IP Ranges
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * The version of the OpenAPI document: 1.0.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import { RESTDataSource } from 'apollo-datasource-rest';

/**
* @module ApiClient
* @version 1.0.1-pre.0
*/

/**
* Manages low level client-server communications, parameter marshalling, etc. There should not be any need for an
* application to use this class directly - the *Api and model classes provide the public API for the service.
* @alias module:ApiClient
* @class
*/
export default class ApiClient extends RESTDataSource {
    constructor(baseURL = 'https://s3.amazonaws.com/okta-ip-ranges') {
        super()

        /**
         * The base URL against which to resolve every API call's (relative) path.
         * @type {String}
         * @default https://s3.amazonaws.com/okta-ip-ranges
         */
        this.baseURL = baseURL.replace(/\/+$/, '');

        /**
         * The authentication methods to be included for all API calls.
         * @type {Array.<String>}
         */
        this.authentications = {
        }
    }

    paramToString(param) {
        if (param == undefined || param == null) {
            return '';
        }
        if (param instanceof Date) {
            return param.toJSON();
        }

        return param.toString();
    }

    parametrizePath(path, pathParams) {
        return path.replace(/\{([\w-]+)\}/g, (fullMatch, key) => {
            var value;
            if (pathParams.hasOwnProperty(key)) {
                value = this.paramToString(pathParams[key]);
            } else {
                value = fullMatch;
            }

            return encodeURIComponent(value);
        });
    }

    isFileParam(param) {
        // fs.ReadStream in Node.js and Electron (but not in runtime like browserify)
        if (typeof require === 'function') {
            let fs;
            try {
                fs = require('fs');
            } catch (err) {}
            if (fs && fs.ReadStream && param instanceof fs.ReadStream) {
                return true;
            }
        }

        // Buffer in Node.js
        if (typeof Buffer === 'function' && param instanceof Buffer) {
            return true;
        }

        // Blob in browser
        if (typeof Blob === 'function' && param instanceof Blob) {
            return true;
        }

        // File in browser (it seems File object is also instance of Blob, but keep this for safe)
        if (typeof File === 'function' && param instanceof File) {
            return true;
        }

        return false;
    }

    normalizeParams(params) {
        var newParams = {};
        for (var key in params) {
            if (params.hasOwnProperty(key) && params[key] != undefined && params[key] != null) {
                var value = params[key];
                if (this.isFileParam(value) || Array.isArray(value)) {
                    newParams[key] = value;
                } else {
                    newParams[key] = this.paramToString(value);
                }
            }
        }

        return newParams;
    }

    buildCollectionParam(param, collectionFormat) {
        if (param == null) {
            return null;
        }
        switch (collectionFormat) {
            case 'csv':
                return param.map(this.paramToString).join(',');
            case 'ssv':
                return param.map(this.paramToString).join(' ');
            case 'tsv':
                return param.map(this.paramToString).join('\t');
            case 'pipes':
                return param.map(this.paramToString).join('|');
            case 'multi':
                //return the array directly as SuperAgent will handle it as expected
                return param.map(this.paramToString);
            default:
                throw new Error('Unknown collection format: ' + collectionFormat);
        }
    }

    applyAuthOptions(fetchOptions, authNames) {
        fetchOptions.headers = fetchOptions.headers || {};

        authNames.forEach((authName) => {
            var auth = this.authentications[authName];
            switch (auth.type) {
                case 'basic':
                    if (auth.username || auth.password) {
                        fetchOptions.headers['Authorization'] = 'Basic ' + base64.encode(auth.username + ":" + auth.password);
                    }

                    break;
                case 'bearer':
                case 'oauth2':
                    if (auth.accessToken) {
                        fetchOptions.headers['Authorization'] = 'Bearer ' + auth.accessToken;
                    }

                    break;
                case 'apiKey':
                    if (auth.apiKey) {
                        var data = {};
                        if (auth.apiKeyPrefix) {
                            data[auth.name] = auth.apiKeyPrefix + ' ' + auth.apiKey;
                        } else {
                            data[auth.name] = auth.apiKey;
                        }

                        if (auth['in'] === 'header') {
                            Object.assign(fetchOptions.headers, data);
                        } else {
                            Object.assign(fetchOptions.params, data);
                        }
                    }

                    break;
                default:
                    throw new Error('Unknown authentication type: ' + auth.type);
            }
        });
    }

    async callApi(path, httpMethod, pathParams,
        queryParams, headerParams, formParams, bodyParam, authNames,
        contentTypes, accepts, returnType, requestInit) {

        var parameterizedPath = this.parametrizePath(path, pathParams);
        var fetchOptions = {
            headers: headerParams,
            params: queryParams
        };

        this.applyAuthOptions(fetchOptions, authNames);

        var body = null;

        if (bodyParam !== null && bodyParam !== undefined) {
            body = bodyParam;
        } else if (formParams !== null && formParams !== undefined) {
            var _formParams = this.normalizeParams(formParams);
            for (var key in _formParams) {
                if (_formParams.hasOwnProperty(key)) {
                    body[key] = _formParams[key];
                }
            }
        }

        var response;
        var httpMethodFn = httpMethod.toLowerCase();

        if (httpMethodFn == 'get' || httpMethodFn == 'delete') {
            response = await this[httpMethodFn](parameterizedPath, [], requestInit);
        } else {
            response = await this[httpMethodFn](parameterizedPath, body, requestInit)
        }

        var convertedResponse = ApiClient.convertToType(response, returnType);
        return convertedResponse;
    }

    static parseDate(str) {
        return new Date(str);
    }

    static convertToType(data, type) {
        if (data === null || data === undefined)
            return data

        switch (type) {
            case 'Boolean':
                return Boolean(data);
            case 'Integer':
                return parseInt(data, 10);
            case 'Number':
                return parseFloat(data);
            case 'String':
                return String(data);
            case 'Date':
                return ApiClient.parseDate(String(data));
            case 'Blob':
                return data;
            default:
                if (typeof type === "object") {
                    // generic object, return directly
                    return data;
                } else if (typeof type.constructFromObject === 'function') {
                    // for model type like User and enum class
                    return type.constructFromObject(data);
                } else if (Array.isArray(type)) {
                    // for array type like: ['String']
                    var itemType = type[0];

                    return data.map((item) => {
                        return ApiClient.convertToType(item, itemType);
                    });
                } else if (typeof type === 'object') {
                    // for plain object type like: {'String': 'Integer'}
                    var keyType, valueType;
                    for (var k in type) {
                        if (type.hasOwnProperty(k)) {
                            keyType = k;
                            valueType = type[k];
                            break;
                        }
                    }

                    var result = {};
                    for (var k in data) {
                        if (data.hasOwnProperty(k)) {
                            var key = ApiClient.convertToType(k, keyType);
                            var value = ApiClient.convertToType(data[k], valueType);
                            result[key] = value;
                        }
                    }

                    return result;
                } else {
                    // for unknown type, return the data directly
                    return data;
                }
        }
    }

    static constructFromObject(data, obj, itemType) {
        if (Array.isArray(data)) {
            for (var i = 0; i < data.length; i++) {
                if (data.hasOwnProperty(i))
                    obj[i] = ApiClient.convertToType(data[i], itemType);
            }
        } else {
            for (var k in data) {
                if (data.hasOwnProperty(k))
                    obj[k] = ApiClient.convertToType(data[k], itemType);
            }
        }
    };
}

ApiClient.CollectionFormatEnum = {
    CSV: ',',
    SSV: ' ',
    TSV: '\t',
    PIPES: '|',
    MULTI: 'multi'
};
