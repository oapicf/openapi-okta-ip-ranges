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
 *
 */


import ApiClient from "../ApiClient";
import IpRangesJsonGet200ResponseValue from '../model/IpRangesJsonGet200ResponseValue';

/**
* Default service.
* @module api/DefaultApi
* @version 0.9.0-pre.0
*/
export default class DefaultApi {

    /**
    * Constructs a new DefaultApi. 
    * @alias module:api/DefaultApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the ipRangesJsonGet operation.
     * @callback module:api/DefaultApi~ipRangesJsonGetCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, module:model/{String: IpRangesJsonGet200ResponseValue}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve Okta IP ranges
     * Returns IP ranges organized by regional cell names.
     * @param {module:api/DefaultApi~ipRangesJsonGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, module:model/{String: IpRangesJsonGet200ResponseValue}>}
     */
    ipRangesJsonGet(callback) {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = {'String': IpRangesJsonGet200ResponseValue};
      return this.apiClient.callApi(
        '/ip_ranges.json', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}