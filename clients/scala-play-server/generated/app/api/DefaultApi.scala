package api

import play.api.libs.json._
import model.IpRangesJsonGet200ResponseValue

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-16T02:03:29.484394803Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait DefaultApi {
  /**
    * Retrieve Okta IP ranges
    * Returns IP ranges organized by regional cell names.
    */
  def ipRangesJsonGet(): Map[String, IpRangesJsonGet200ResponseValue]
}
