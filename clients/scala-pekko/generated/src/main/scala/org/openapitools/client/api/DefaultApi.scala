/**
 * OpenAPI Okta IP Ranges
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * The version of the OpenAPI document: 0.10.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.model.IpRangesJsonGet200ResponseValue
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object DefaultApi {

  def apply(baseUrl: String = "https://s3.amazonaws.com/okta-ip-ranges") = new DefaultApi(baseUrl)
}

class DefaultApi(baseUrl: String) {

  /**
   * Returns IP ranges organized by regional cell names.
   * 
   * Expected answers:
   *   code 200 : Map[String, IpRangesJsonGet200ResponseValue] (A JSON object of regional cells with IP ranges.)
   */
  def ipRangesJsonGet(): ApiRequest[Map[String, IpRangesJsonGet200ResponseValue]] =
    ApiRequest[Map[String, IpRangesJsonGet200ResponseValue]](ApiMethods.GET, baseUrl, "/ip_ranges.json", "application/json")
      .withSuccessResponse[Map[String, IpRangesJsonGet200ResponseValue]](200)
      



}

