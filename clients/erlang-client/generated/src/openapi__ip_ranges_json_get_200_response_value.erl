-module(openapi__ip_ranges_json_get_200_response_value).

-export([encode/1]).

-export_type([openapi__ip_ranges_json_get_200_response_value/0]).

-type openapi__ip_ranges_json_get_200_response_value() ::
    #{ 'ip_ranges' => list()
     }.

encode(#{ 'ip_ranges' := IpRanges
        }) ->
    #{ 'ip_ranges' => IpRanges
     }.
