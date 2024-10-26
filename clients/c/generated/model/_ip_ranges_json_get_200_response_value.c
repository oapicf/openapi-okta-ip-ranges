#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "_ip_ranges_json_get_200_response_value.h"



_ip_ranges_json_get_200_response_value_t *_ip_ranges_json_get_200_response_value_create(
    list_t *ip_ranges
    ) {
    _ip_ranges_json_get_200_response_value_t *_ip_ranges_json_get_200_response_value_local_var = malloc(sizeof(_ip_ranges_json_get_200_response_value_t));
    if (!_ip_ranges_json_get_200_response_value_local_var) {
        return NULL;
    }
    _ip_ranges_json_get_200_response_value_local_var->ip_ranges = ip_ranges;

    return _ip_ranges_json_get_200_response_value_local_var;
}


void _ip_ranges_json_get_200_response_value_free(_ip_ranges_json_get_200_response_value_t *_ip_ranges_json_get_200_response_value) {
    if(NULL == _ip_ranges_json_get_200_response_value){
        return ;
    }
    listEntry_t *listEntry;
    if (_ip_ranges_json_get_200_response_value->ip_ranges) {
        list_ForEach(listEntry, _ip_ranges_json_get_200_response_value->ip_ranges) {
            free(listEntry->data);
        }
        list_freeList(_ip_ranges_json_get_200_response_value->ip_ranges);
        _ip_ranges_json_get_200_response_value->ip_ranges = NULL;
    }
    free(_ip_ranges_json_get_200_response_value);
}

cJSON *_ip_ranges_json_get_200_response_value_convertToJSON(_ip_ranges_json_get_200_response_value_t *_ip_ranges_json_get_200_response_value) {
    cJSON *item = cJSON_CreateObject();

    // _ip_ranges_json_get_200_response_value->ip_ranges
    if(_ip_ranges_json_get_200_response_value->ip_ranges) {
    cJSON *ip_ranges = cJSON_AddArrayToObject(item, "ip_ranges");
    if(ip_ranges == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *ip_rangesListEntry;
    list_ForEach(ip_rangesListEntry, _ip_ranges_json_get_200_response_value->ip_ranges) {
    if(cJSON_AddStringToObject(ip_ranges, "", (char*)ip_rangesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

_ip_ranges_json_get_200_response_value_t *_ip_ranges_json_get_200_response_value_parseFromJSON(cJSON *_ip_ranges_json_get_200_response_valueJSON){

    _ip_ranges_json_get_200_response_value_t *_ip_ranges_json_get_200_response_value_local_var = NULL;

    // define the local list for _ip_ranges_json_get_200_response_value->ip_ranges
    list_t *ip_rangesList = NULL;

    // _ip_ranges_json_get_200_response_value->ip_ranges
    cJSON *ip_ranges = cJSON_GetObjectItemCaseSensitive(_ip_ranges_json_get_200_response_valueJSON, "ip_ranges");
    if (ip_ranges) { 
    cJSON *ip_ranges_local = NULL;
    if(!cJSON_IsArray(ip_ranges)) {
        goto end;//primitive container
    }
    ip_rangesList = list_createList();

    cJSON_ArrayForEach(ip_ranges_local, ip_ranges)
    {
        if(!cJSON_IsString(ip_ranges_local))
        {
            goto end;
        }
        list_addElement(ip_rangesList , strdup(ip_ranges_local->valuestring));
    }
    }


    _ip_ranges_json_get_200_response_value_local_var = _ip_ranges_json_get_200_response_value_create (
        ip_ranges ? ip_rangesList : NULL
        );

    return _ip_ranges_json_get_200_response_value_local_var;
end:
    if (ip_rangesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ip_rangesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ip_rangesList);
        ip_rangesList = NULL;
    }
    return NULL;

}
