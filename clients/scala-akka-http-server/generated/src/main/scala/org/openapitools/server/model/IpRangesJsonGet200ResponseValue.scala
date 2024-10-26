package org.openapitools.server.model


/**
 * Object containing IP ranges for a specific regional cell
 *
 * @param ipRanges  for example: ''null''
*/
final case class IpRangesJsonGet200ResponseValue (
  ipRanges: Option[Seq[String]] = None
)

