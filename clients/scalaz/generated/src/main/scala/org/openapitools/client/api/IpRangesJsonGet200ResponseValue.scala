package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IpRangesJsonGet200ResponseValue._

case class IpRangesJsonGet200ResponseValue (
  ipRanges: Option[List[String]])

object IpRangesJsonGet200ResponseValue {
  import DateTimeCodecs._

  implicit val IpRangesJsonGet200ResponseValueCodecJson: CodecJson[IpRangesJsonGet200ResponseValue] = CodecJson.derive[IpRangesJsonGet200ResponseValue]
  implicit val IpRangesJsonGet200ResponseValueDecoder: EntityDecoder[IpRangesJsonGet200ResponseValue] = jsonOf[IpRangesJsonGet200ResponseValue]
  implicit val IpRangesJsonGet200ResponseValueEncoder: EntityEncoder[IpRangesJsonGet200ResponseValue] = jsonEncoderOf[IpRangesJsonGet200ResponseValue]
}
