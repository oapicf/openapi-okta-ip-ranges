package model

import play.api.libs.json._

/**
  * Object containing IP ranges for a specific regional cell
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-02T04:12:58.293129539Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class IpRangesJsonGet200ResponseValue(
  ipRanges: Option[List[String]]
)

object IpRangesJsonGet200ResponseValue {
  implicit lazy val ipRangesJsonGet200ResponseValueJsonFormat: Format[IpRangesJsonGet200ResponseValue] = Json.format[IpRangesJsonGet200ResponseValue]
}

