#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "_ip_ranges_json_get_200_response_value.h"

using namespace std;
using namespace Tizen::ArtikCloud;

_ip_ranges_json_get_200_response_value::_ip_ranges_json_get_200_response_value()
{
	//__init();
}

_ip_ranges_json_get_200_response_value::~_ip_ranges_json_get_200_response_value()
{
	//__cleanup();
}

void
_ip_ranges_json_get_200_response_value::__init()
{
	//new std::list()std::list> ip_ranges;
}

void
_ip_ranges_json_get_200_response_value::__cleanup()
{
	//if(ip_ranges != NULL) {
	//ip_ranges.RemoveAll(true);
	//delete ip_ranges;
	//ip_ranges = NULL;
	//}
	//
}

void
_ip_ranges_json_get_200_response_value::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ip_rangesKey = "ip_ranges";
	node = json_object_get_member(pJsonObject, ip_rangesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			ip_ranges = new_list;
		}
		
	}
}

_ip_ranges_json_get_200_response_value::_ip_ranges_json_get_200_response_value(char* json)
{
	this->fromJson(json);
}

char*
_ip_ranges_json_get_200_response_value::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getIpRanges());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getIpRanges());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *ip_rangesKey = "ip_ranges";
	json_object_set_member(pJsonObject, ip_rangesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
_ip_ranges_json_get_200_response_value::getIpRanges()
{
	return ip_ranges;
}

void
_ip_ranges_json_get_200_response_value::setIpRanges(std::list <std::string> ip_ranges)
{
	this->ip_ranges = ip_ranges;
}


