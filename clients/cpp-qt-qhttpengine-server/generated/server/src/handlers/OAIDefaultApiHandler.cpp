/**
 * OpenAPI Okta IP Ranges
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * The version of the OpenAPI document: 0.10.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAIDefaultApiHandler.h"
#include "OAIDefaultApiRequest.h"

namespace OpenAPI {

OAIDefaultApiHandler::OAIDefaultApiHandler(){

}

OAIDefaultApiHandler::~OAIDefaultApiHandler(){

}

void OAIDefaultApiHandler::ipRangesJsonGet() {
    auto reqObj = qobject_cast<OAIDefaultApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        QMap<QString, OAI_ip_ranges_json_get_200_response_value> res;
        reqObj->ipRangesJsonGetResponse(res);
    }
}


}
