package api

import play.api.libs.json._
import model.IpRangesJsonGet200ResponseValue

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-25T00:21:07.246470559Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait DefaultApi {
  /**
    * Retrieve Okta IP ranges
    * Returns IP ranges organized by regional cell names.
    */
  def ipRangesJsonGet(): Map[String, IpRangesJsonGet200ResponseValue]
}
