package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.IpRangesJsonGet200ResponseValue


class DefaultApi(
    defaultService: DefaultApiService,
    defaultMarshaller: DefaultApiMarshaller
) {

  
  import defaultMarshaller._

  lazy val route: Route =
    path("ip_ranges.json") { 
      get {  
            defaultService.ipRangesJsonGet()
      }
    }
}


trait DefaultApiService {

  def ipRangesJsonGet200(responseIpRangesJsonGet200ResponseValue: Map[String, IpRangesJsonGet200ResponseValue])(implicit toEntityMarshallerIpRangesJsonGet200ResponseValue: ToEntityMarshaller[Map[String, IpRangesJsonGet200ResponseValue]]): Route =
    complete((200, responseIpRangesJsonGet200ResponseValue))
  /**
   * Code: 200, Message: A JSON object of regional cells with IP ranges., DataType: Map[String, IpRangesJsonGet200ResponseValue]
   */
  def ipRangesJsonGet()
      (implicit toEntityMarshallerIpRangesJsonGet200ResponseValue: ToEntityMarshaller[Map[String, IpRangesJsonGet200ResponseValue]]): Route

}

trait DefaultApiMarshaller {


  implicit def toEntityMarshallerIpRangesJsonGet200ResponseValue: ToEntityMarshaller[Map[String, IpRangesJsonGet200ResponseValue]]

}

