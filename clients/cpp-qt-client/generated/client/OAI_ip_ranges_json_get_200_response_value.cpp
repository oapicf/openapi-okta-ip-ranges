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

#include "OAI_ip_ranges_json_get_200_response_value.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAI_ip_ranges_json_get_200_response_value::OAI_ip_ranges_json_get_200_response_value(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAI_ip_ranges_json_get_200_response_value::OAI_ip_ranges_json_get_200_response_value() {
    this->initializeModel();
}

OAI_ip_ranges_json_get_200_response_value::~OAI_ip_ranges_json_get_200_response_value() {}

void OAI_ip_ranges_json_get_200_response_value::initializeModel() {

    m_ip_ranges_isSet = false;
    m_ip_ranges_isValid = false;
}

void OAI_ip_ranges_json_get_200_response_value::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAI_ip_ranges_json_get_200_response_value::fromJsonObject(QJsonObject json) {

    m_ip_ranges_isValid = ::OpenAPI::fromJsonValue(m_ip_ranges, json[QString("ip_ranges")]);
    m_ip_ranges_isSet = !json[QString("ip_ranges")].isNull() && m_ip_ranges_isValid;
}

QString OAI_ip_ranges_json_get_200_response_value::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAI_ip_ranges_json_get_200_response_value::asJsonObject() const {
    QJsonObject obj;
    if (m_ip_ranges.size() > 0) {
        obj.insert(QString("ip_ranges"), ::OpenAPI::toJsonValue(m_ip_ranges));
    }
    return obj;
}

QList<QString> OAI_ip_ranges_json_get_200_response_value::getIpRanges() const {
    return m_ip_ranges;
}
void OAI_ip_ranges_json_get_200_response_value::setIpRanges(const QList<QString> &ip_ranges) {
    m_ip_ranges = ip_ranges;
    m_ip_ranges_isSet = true;
}

bool OAI_ip_ranges_json_get_200_response_value::is_ip_ranges_Set() const{
    return m_ip_ranges_isSet;
}

bool OAI_ip_ranges_json_get_200_response_value::is_ip_ranges_Valid() const{
    return m_ip_ranges_isValid;
}

bool OAI_ip_ranges_json_get_200_response_value::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_ip_ranges.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAI_ip_ranges_json_get_200_response_value::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
