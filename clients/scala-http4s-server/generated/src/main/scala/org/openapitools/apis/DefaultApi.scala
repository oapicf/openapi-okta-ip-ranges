package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.IpRangesJsonGet200ResponseValue


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class DefaultApiRoutes[
  F[_]: JsonDecoder: Monad
](delegate: DefaultApiDelegate[F]) extends Http4sDsl[F] {
  object ipRangesJsonGet {
    import DefaultApiDelegate.ipRangesJsonGetResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "ip_ranges.json" =>
        delegate.ipRangesJsonGet.handle(req, responses)

    }


    val responses: ipRangesJsonGetResponses[F] = new ipRangesJsonGetResponses[F] {
      def resp200(value: Map[String, IpRangesJsonGet200ResponseValue]): F[Response[F]] = Ok(value)
    }
  }

  val routes =
    ipRangesJsonGet.route
}

object DefaultApiDelegate {
  trait ipRangesJsonGetResponses[F[_]] {
    def resp200(value: Map[String, IpRangesJsonGet200ResponseValue]): F[Response[F]]
  }

}

trait DefaultApiDelegate[F[_]] {

  trait ipRangesJsonGet {
    import DefaultApiDelegate.ipRangesJsonGetResponses

    def handle(
      req: Request[F],
      responses: ipRangesJsonGetResponses[F]
    ): F[Response[F]]

  }
  def ipRangesJsonGet: ipRangesJsonGet

}