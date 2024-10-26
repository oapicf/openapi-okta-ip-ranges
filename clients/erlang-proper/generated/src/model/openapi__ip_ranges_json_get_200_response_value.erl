-module(openapi__ip_ranges_json_get_200_response_value).

-include("openapi.hrl").

-export([openapi__ip_ranges_json_get_200_response_value/0]).

-export([openapi__ip_ranges_json_get_200_response_value/1]).

-export_type([openapi__ip_ranges_json_get_200_response_value/0]).

-type openapi__ip_ranges_json_get_200_response_value() ::
  [ {'ip_ranges', list(binary()) }
  ].


openapi__ip_ranges_json_get_200_response_value() ->
    openapi__ip_ranges_json_get_200_response_value([]).

openapi__ip_ranges_json_get_200_response_value(Fields) ->
  Default = [ {'ip_ranges', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

