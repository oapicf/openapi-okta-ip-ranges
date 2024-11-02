/**
* OpenAPI Okta IP Ranges
* OpenAPI specification and a set of generated API clients for Okta IP Ranges
*
* The version of the OpenAPI document: 0.9.0-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

/*
* DefaultApiImpl.h
*
* 
*/

#ifndef DEFAULT_API_IMPL_H_
#define DEFAULT_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <DefaultApi.h>


#include "_ip_ranges_json_get_200_response_value.h"
#include <map>

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class  DefaultApiImpl : public org::openapitools::server::api::DefaultApi {
public:
    explicit DefaultApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~DefaultApiImpl() override = default;

    void ip_ranges_json_get(Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif