/**
 * OpenAPI Okta IP Ranges
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * The version of the OpenAPI document: 1.0.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.12.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "CppRestOpenAPIClient/JsonBody.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

JsonBody::JsonBody( const web::json::value& json)
    : m_Json(json)
{
}

JsonBody::~JsonBody()
{
}

void JsonBody::writeTo( std::ostream& target )
{
    m_Json.serialize(target);
}

}
}
}
}
