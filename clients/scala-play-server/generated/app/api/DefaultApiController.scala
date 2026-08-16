package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.IpRangesJsonGet200ResponseValue

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-16T02:03:29.484394803Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class DefaultApiController @Inject()(cc: ControllerComponents, api: DefaultApi) extends AbstractController(cc) {
  /**
    * GET /okta-ip-ranges/ip_ranges.json
    */
  def ipRangesJsonGet(): Action[AnyContent] = Action { request =>
    def executeApi(): Map[String, IpRangesJsonGet200ResponseValue] = {
      api.ipRangesJsonGet()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
