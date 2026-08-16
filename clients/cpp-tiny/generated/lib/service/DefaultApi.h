#ifndef TINY_CPP_CLIENT_DefaultApi_H_
#define TINY_CPP_CLIENT_DefaultApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include <map>
#include "_ip_ranges_json_get_200_response_value.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class DefaultApi : public Service {
public:
    DefaultApi() = default;

    virtual ~DefaultApi() = default;

    /**
    * Retrieve Okta IP ranges.
    *
    * Returns IP ranges organized by regional cell names.
    */
    Response<
                String
        >
    ipRangesJsonGet(
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_DefaultApi_H_ */