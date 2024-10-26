#ifndef _ip_ranges_json_get_200_response_value_TEST
#define _ip_ranges_json_get_200_response_value_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define _ip_ranges_json_get_200_response_value_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/_ip_ranges_json_get_200_response_value.h"
_ip_ranges_json_get_200_response_value_t* instantiate__ip_ranges_json_get_200_response_value(int include_optional);



_ip_ranges_json_get_200_response_value_t* instantiate__ip_ranges_json_get_200_response_value(int include_optional) {
  _ip_ranges_json_get_200_response_value_t* _ip_ranges_json_get_200_response_value = NULL;
  if (include_optional) {
    _ip_ranges_json_get_200_response_value = _ip_ranges_json_get_200_response_value_create(
      list_createList()
    );
  } else {
    _ip_ranges_json_get_200_response_value = _ip_ranges_json_get_200_response_value_create(
      list_createList()
    );
  }

  return _ip_ranges_json_get_200_response_value;
}


#ifdef _ip_ranges_json_get_200_response_value_MAIN

void test__ip_ranges_json_get_200_response_value(int include_optional) {
    _ip_ranges_json_get_200_response_value_t* _ip_ranges_json_get_200_response_value_1 = instantiate__ip_ranges_json_get_200_response_value(include_optional);

	cJSON* json_ip_ranges_json_get_200_response_value_1 = _ip_ranges_json_get_200_response_value_convertToJSON(_ip_ranges_json_get_200_response_value_1);
	printf("_ip_ranges_json_get_200_response_value :\n%s\n", cJSON_Print(json_ip_ranges_json_get_200_response_value_1));
	_ip_ranges_json_get_200_response_value_t* _ip_ranges_json_get_200_response_value_2 = _ip_ranges_json_get_200_response_value_parseFromJSON(json_ip_ranges_json_get_200_response_value_1);
	cJSON* json_ip_ranges_json_get_200_response_value_2 = _ip_ranges_json_get_200_response_value_convertToJSON(_ip_ranges_json_get_200_response_value_2);
	printf("repeating _ip_ranges_json_get_200_response_value:\n%s\n", cJSON_Print(json_ip_ranges_json_get_200_response_value_2));
}

int main() {
  test__ip_ranges_json_get_200_response_value(1);
  test__ip_ranges_json_get_200_response_value(0);

  printf("Hello world \n");
  return 0;
}

#endif // _ip_ranges_json_get_200_response_value_MAIN
#endif // _ip_ranges_json_get_200_response_value_TEST
