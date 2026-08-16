

#include "_ip_ranges_json_get_200_response_value.h"

using namespace Tiny;

_ip_ranges_json_get_200_response_value::_ip_ranges_json_get_200_response_value()
{
	ip_ranges = std::list<std::string>();
}

_ip_ranges_json_get_200_response_value::_ip_ranges_json_get_200_response_value(std::string jsonString)
{
	this->fromJson(jsonString);
}

_ip_ranges_json_get_200_response_value::~_ip_ranges_json_get_200_response_value()
{

}

void
_ip_ranges_json_get_200_response_value::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ip_rangesKey = "ip_ranges";

    if(object.has_key(ip_rangesKey))
    {
        bourne::json value = object[ip_rangesKey];


        std::list<std::string> ip_ranges_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            ip_ranges_list.push_back(element);
        }
        ip_ranges = ip_ranges_list;


    }


}

bourne::json
_ip_ranges_json_get_200_response_value::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> ip_ranges_list = getIpRanges();
    bourne::json ip_ranges_arr = bourne::json::array();

    for(auto& var : ip_ranges_list)
    {
        ip_ranges_arr.append(var);
    }
    object["ip_ranges"] = ip_ranges_arr;






    return object;

}

std::list<std::string>
_ip_ranges_json_get_200_response_value::getIpRanges()
{
	return ip_ranges;
}

void
_ip_ranges_json_get_200_response_value::setIpRanges(std::list<std::string> ip_ranges)
{
	this->ip_ranges = ip_ranges;
}



