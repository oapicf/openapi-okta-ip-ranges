package org.openapitools.models

import java.time._

import io.circe.refined._
import io.circe.syntax._
import io.circe.{ Decoder, Encoder }
import io.circe.generic.semiauto.{ deriveDecoder, deriveEncoder }


/**
* Object containing IP ranges for a specific regional cell
* @param ipUnderscoreranges 
*/

case class IpRangesJsonGet200ResponseValue(
  ipUnderscoreranges: Option[List[String]]
)
object IpRangesJsonGet200ResponseValue {
  implicit val encoderIpRangesJsonGet200ResponseValue: Encoder[IpRangesJsonGet200ResponseValue] = deriveEncoder[IpRangesJsonGet200ResponseValue].mapJson(_.dropNullValues)
  implicit val decoderIpRangesJsonGet200ResponseValue: Decoder[IpRangesJsonGet200ResponseValue] = deriveDecoder[IpRangesJsonGet200ResponseValue]
}

