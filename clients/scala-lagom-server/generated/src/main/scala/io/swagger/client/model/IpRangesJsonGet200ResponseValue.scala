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

package io.swagger.client.model
import play.api.libs.json._

case class IpRangesJsonGet200ResponseValue (
                  ipRanges: Option[Seq[String]]
)

object IpRangesJsonGet200ResponseValue {
implicit val format: Format[IpRangesJsonGet200ResponseValue] = Json.format
}

