#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/_ip_ranges_json_get_200_response_value.h"


// Retrieve Okta IP ranges
//
// Returns IP ranges organized by regional cell names.
//
list_t*_t*
DefaultAPI_ipRangesJsonGet(apiClient_t *apiClient);


