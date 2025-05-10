package api

import play.api.libs.json._
import model.IpRangesJsonGet200ResponseValue

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:07:46.452602233Z[Etc/UTC]", comments = "Generator version: 7.12.0")
trait DefaultApi {
  /**
    * Retrieve Okta IP ranges
    * Returns IP ranges organized by regional cell names.
    */
  def ipRangesJsonGet(): Map[String, IpRangesJsonGet200ResponseValue]
}
