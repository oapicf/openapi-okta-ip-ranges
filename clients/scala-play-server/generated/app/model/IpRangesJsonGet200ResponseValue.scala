package model

import play.api.libs.json._

/**
  * Object containing IP ranges for a specific regional cell
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:07:46.452602233Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class IpRangesJsonGet200ResponseValue(
  ipRanges: Option[List[String]]
)

object IpRangesJsonGet200ResponseValue {
  implicit lazy val ipRangesJsonGet200ResponseValueJsonFormat: Format[IpRangesJsonGet200ResponseValue] = Json.format[IpRangesJsonGet200ResponseValue]
}

