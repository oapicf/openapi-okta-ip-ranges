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

#ifndef OAI_OBJECT_H
#define OAI_OBJECT_H

#include <QJsonDocument>
#include <QJsonObject>
#include <QMetaType>

namespace OpenAPI {

class OAIObject {
public:
    OAIObject() {}

    OAIObject(QString jsonString) {
        fromJson(jsonString);
    }

    virtual ~OAIObject() {}

    virtual QJsonObject asJsonObject() const {
        return jObj;
    }

    virtual QString asJson() const {
        QJsonDocument doc(jObj);
        return doc.toJson(QJsonDocument::Compact);
    }

    virtual void fromJson(QString jsonString) {
        QJsonDocument doc = QJsonDocument::fromJson(jsonString.toUtf8());
        jObj = doc.object();
    }

    virtual void fromJsonObject(QJsonObject json) {
        jObj = json;
    }

    virtual bool isSet() const {
        return false;
    }

    virtual bool isValid() const {
        return true;
    }

private:
    QJsonObject jObj;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIObject)

#endif // OAI_OBJECT_H
