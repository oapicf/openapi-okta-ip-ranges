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
export default class DefaultApi extends ApiClient {

    /**
    * Constructs a new DefaultApi. 
    * @alias module:api/DefaultApi
    * @class
    */
    constructor(baseURL = 'https://s3.amazonaws.com/okta-ip-ranges') {
      super(baseURL);
    }


    /**
     * Retrieve Okta IP ranges
     * Returns IP ranges organized by regional cell names.
     * @param requestInit Dynamic configuration. @see {@link https://github.com/apollographql/apollo-server/pull/1277}
     * @return {Promise<Object.<String, module:model/{String: IpRangesJsonGet200ResponseValue}>>}
     */
    async ipRangesJsonGet(requestInit) {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/0.9.0-pre.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = {'String': IpRangesJsonGet200ResponseValue};

      return this.callApi(
        '/ip_ranges.json', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, requestInit
      );
    }


}