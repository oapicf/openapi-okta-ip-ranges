package model

import play.api.libs.json._

/**
  * Object containing IP ranges for a specific regional cell
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-10-26T04:09:21.032846655Z[Etc/UTC]", comments = "Generator version: 7.6.0")
case class IpRangesJsonGet200ResponseValue(
  ipRanges: Option[List[String]]
)

object IpRangesJsonGet200ResponseValue {
  implicit lazy val ipRangesJsonGet200ResponseValueJsonFormat: Format[IpRangesJsonGet200ResponseValue] = Json.format[IpRangesJsonGet200ResponseValue]
}

