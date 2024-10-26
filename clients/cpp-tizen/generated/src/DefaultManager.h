#ifndef _DefaultManager_H_
#define _DefaultManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "_ip_ranges_json_get_200_response_value.h"
#include <map>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Default Default
 * \ingroup Operations
 *  @{
 */
class DefaultManager {
public:
	DefaultManager();
	virtual ~DefaultManager();

/*! \brief Retrieve Okta IP ranges. *Synchronous*
 *
 * Returns IP ranges organized by regional cell names.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ipRangesJsonGetSync(char * accessToken,
	
	void(* handler)(std::map<std::string,std::string>, Error, void* )
	, void* userData);

/*! \brief Retrieve Okta IP ranges. *Asynchronous*
 *
 * Returns IP ranges organized by regional cell names.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ipRangesJsonGetAsync(char * accessToken,
	
	void(* handler)(std::map<std::string,std::string>, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://s3.amazonaws.com/okta-ip-ranges";
	}
};
/** @}*/

}
}
#endif /* DefaultManager_H_ */
