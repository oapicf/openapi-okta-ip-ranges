-module(openapi_default_api).

-export([ip_ranges_json_get/1, ip_ranges_json_get/2]).

-define(BASE_URL, <<"/okta-ip-ranges">>).

%% @doc Retrieve Okta IP ranges
%% Returns IP ranges organized by regional cell names.
-spec ip_ranges_json_get(ctx:ctx()) -> {ok, maps:map(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ip_ranges_json_get(Ctx) ->
    ip_ranges_json_get(Ctx, #{}).

-spec ip_ranges_json_get(ctx:ctx(), maps:map()) -> {ok, maps:map(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
ip_ranges_json_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ip_ranges.json"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


