/**
 * OpenAPI Okta IP Ranges
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * The version of the OpenAPI document: 0.10.1-pre.0
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

#ifndef _ip_ranges_json_get_200_response_value_H_
#define _ip_ranges_json_get_200_response_value_H_



#include <string>
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Object containing IP ranges for a specific regional cell
/// </summary>
class  _ip_ranges_json_get_200_response_value 
{
public:
    _ip_ranges_json_get_200_response_value() = default;
    explicit _ip_ranges_json_get_200_response_value(boost::property_tree::ptree const& pt);
    virtual ~_ip_ranges_json_get_200_response_value() = default;

    _ip_ranges_json_get_200_response_value(const _ip_ranges_json_get_200_response_value& other) = default; // copy constructor
    _ip_ranges_json_get_200_response_value(_ip_ranges_json_get_200_response_value&& other) noexcept = default; // move constructor

    _ip_ranges_json_get_200_response_value& operator=(const _ip_ranges_json_get_200_response_value& other) = default; // copy assignment
    _ip_ranges_json_get_200_response_value& operator=(_ip_ranges_json_get_200_response_value&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// _ip_ranges_json_get_200_response_value members

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::string> getIpRanges() const;
    void setIpRanges(std::vector<std::string> value);

protected:
    std::vector<std::string> m_Ip_ranges;
};

std::vector<_ip_ranges_json_get_200_response_value> create_ip_ranges_json_get_200_response_valueVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<_ip_ranges_json_get_200_response_value>(const _ip_ranges_json_get_200_response_value& val) {
    return val.toPropertyTree();
}

template<>
inline _ip_ranges_json_get_200_response_value fromPt<_ip_ranges_json_get_200_response_value>(const boost::property_tree::ptree& pt) {
    _ip_ranges_json_get_200_response_value ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* _ip_ranges_json_get_200_response_value_H_ */
