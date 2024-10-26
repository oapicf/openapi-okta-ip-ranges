package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * Object containing IP ranges for a specific regional cell
 * @param ipUnderscoreranges 
 */
case class IpRangesJsonGet200ResponseValue(ipUnderscoreranges: Option[Seq[String]]
                )

object IpRangesJsonGet200ResponseValue {
    /**
     * Creates the codec for converting IpRangesJsonGet200ResponseValue from and to JSON.
     */
    implicit val decoder: Decoder[IpRangesJsonGet200ResponseValue] = deriveDecoder
    implicit val encoder: ObjectEncoder[IpRangesJsonGet200ResponseValue] = deriveEncoder
}
