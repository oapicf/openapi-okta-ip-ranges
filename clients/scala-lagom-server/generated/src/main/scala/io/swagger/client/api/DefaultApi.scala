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
 */

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer

import io.swagger.client.model.IpRangesJsonGet200ResponseValue

trait DefaultApi extends Service {


  final override def descriptor = {
    import Service._
    named("DefaultApi").withCalls(
      restCall(Method.GET, "/ip_ranges.json", ipRangesJsonGet _)
    ).withAutoAcl(true)
  }


  /**
    * Retrieve Okta IP ranges
    * Returns IP ranges organized by regional cell names.
    * 
    * @return Map[String, IpRangesJsonGet200ResponseValue]
    */
  def ipRangesJsonGet(): ServiceCall[NotUsed ,Map[String, IpRangesJsonGet200ResponseValue]]
  

  }
