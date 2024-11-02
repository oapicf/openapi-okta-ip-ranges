package api

import play.api.libs.json._
import model.IpRangesJsonGet200ResponseValue

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-02T04:12:58.293129539Z[Etc/UTC]", comments = "Generator version: 7.9.0")
trait DefaultApi {
  /**
    * Retrieve Okta IP ranges
    * Returns IP ranges organized by regional cell names.
    */
  def ipRangesJsonGet(): Map[String, IpRangesJsonGet200ResponseValue]
}
