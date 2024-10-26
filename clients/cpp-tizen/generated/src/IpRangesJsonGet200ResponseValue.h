/*
 * _ip_ranges_json_get_200_response_value.h
 *
 * Object containing IP ranges for a specific regional cell
 */

#ifndef __ip_ranges_json_get_200_response_value_H_
#define __ip_ranges_json_get_200_response_value_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object containing IP ranges for a specific regional cell
 *
 *  \ingroup Models
 *
 */

class _ip_ranges_json_get_200_response_value : public Object {
public:
	/*! \brief Constructor.
	 */
	_ip_ranges_json_get_200_response_value();
	_ip_ranges_json_get_200_response_value(char* str);

	/*! \brief Destructor.
	 */
	virtual ~_ip_ranges_json_get_200_response_value();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<std::string> getIpRanges();

	/*! \brief Set 
	 */
	void setIpRanges(std::list <std::string> ip_ranges);

private:
	std::list <std::string>ip_ranges;
	void __init();
	void __cleanup();

};
}
}

#endif /* __ip_ranges_json_get_200_response_value_H_ */
