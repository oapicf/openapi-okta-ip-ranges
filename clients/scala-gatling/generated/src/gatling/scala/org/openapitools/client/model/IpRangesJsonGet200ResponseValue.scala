
package org.openapitools.client.model


case class IpRangesJsonGet200ResponseValue (
    _ipRanges: Option[List[String]]
)
object IpRangesJsonGet200ResponseValue {
    def toStringBody(var_ipRanges: Object) =
        s"""
        | {
        | "ipRanges":$var_ipRanges
        | }
        """.stripMargin
}
