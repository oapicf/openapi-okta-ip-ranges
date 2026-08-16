
/*
 * _ip_ranges_json_get_200_response_value.h
 *
 * Object containing IP ranges for a specific regional cell
 */

#ifndef TINY_CPP_CLIENT__ip_ranges_json_get_200_response_value_H_
#define TINY_CPP_CLIENT__ip_ranges_json_get_200_response_value_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Object containing IP ranges for a specific regional cell
 *
 *  \ingroup Models
 *
 */

class _ip_ranges_json_get_200_response_value{
public:

    /*! \brief Constructor.
	 */
    _ip_ranges_json_get_200_response_value();
    _ip_ranges_json_get_200_response_value(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~_ip_ranges_json_get_200_response_value();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<std::string> getIpRanges();

	/*! \brief Set 
	 */
	void setIpRanges(std::list <std::string> ip_ranges);


    private:
    std::list<std::string> ip_ranges;
};
}

#endif /* TINY_CPP_CLIENT__ip_ranges_json_get_200_response_value_H_ */
