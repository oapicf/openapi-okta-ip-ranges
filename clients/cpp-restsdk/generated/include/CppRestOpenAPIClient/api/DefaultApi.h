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
 * DefaultApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_DefaultApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_DefaultApi_H_



#include "CppRestOpenAPIClient/ApiClient.h"

#include "CppRestOpenAPIClient/model/_ip_ranges_json_get_200_response_value.h"
#include <map>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  DefaultApi 
{
public:

    explicit DefaultApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~DefaultApi();

    /// <summary>
    /// Retrieve Okta IP ranges
    /// </summary>
    /// <remarks>
    /// Returns IP ranges organized by regional cell names.
    /// </remarks>
    pplx::task<std::map<utility::string_t, std::shared_ptr<_ip_ranges_json_get_200_response_value>>> ipRangesJsonGet(
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_DefaultApi_H_ */

