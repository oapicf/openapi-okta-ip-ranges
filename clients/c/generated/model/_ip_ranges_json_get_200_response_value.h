/*
 * _ip_ranges_json_get_200_response_value.h
 *
 * Object containing IP ranges for a specific regional cell
 */

#ifndef __ip_ranges_json_get_200_response_value_H_
#define __ip_ranges_json_get_200_response_value_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct _ip_ranges_json_get_200_response_value_t _ip_ranges_json_get_200_response_value_t;




typedef struct _ip_ranges_json_get_200_response_value_t {
    list_t *ip_ranges; //primitive container

} _ip_ranges_json_get_200_response_value_t;

_ip_ranges_json_get_200_response_value_t *_ip_ranges_json_get_200_response_value_create(
    list_t *ip_ranges
);

void _ip_ranges_json_get_200_response_value_free(_ip_ranges_json_get_200_response_value_t *_ip_ranges_json_get_200_response_value);

_ip_ranges_json_get_200_response_value_t *_ip_ranges_json_get_200_response_value_parseFromJSON(cJSON *_ip_ranges_json_get_200_response_valueJSON);

cJSON *_ip_ranges_json_get_200_response_value_convertToJSON(_ip_ranges_json_get_200_response_value_t *_ip_ranges_json_get_200_response_value);

#endif /* __ip_ranges_json_get_200_response_value_H_ */

