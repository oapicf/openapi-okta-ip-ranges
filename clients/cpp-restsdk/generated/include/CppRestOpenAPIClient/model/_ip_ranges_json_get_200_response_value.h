/**
 * OpenAPI Okta IP Ranges
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * _ip_ranges_json_get_200_response_value.h
 *
 * Object containing IP ranges for a specific regional cell
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL__ip_ranges_json_get_200_response_value_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL__ip_ranges_json_get_200_response_value_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Object containing IP ranges for a specific regional cell
/// </summary>
class  _ip_ranges_json_get_200_response_value
    : public ModelBase
{
public:
    _ip_ranges_json_get_200_response_value();
    virtual ~_ip_ranges_json_get_200_response_value();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// _ip_ranges_json_get_200_response_value members

    /// <summary>
    /// 
    /// </summary>
    std::vector<utility::string_t>& getIpRanges();
    bool ipRangesIsSet() const;
    void unsetIp_ranges();

    void setIpRanges(const std::vector<utility::string_t>& value);


protected:
    std::vector<utility::string_t> m_Ip_ranges;
    bool m_Ip_rangesIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL__ip_ranges_json_get_200_response_value_H_ */
