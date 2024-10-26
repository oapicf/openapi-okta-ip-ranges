-module(openapi_api).

-export([ ip_ranges_json_get/0
        ]).

-define(BASE_URL, "/okta-ip-ranges").

%% @doc Retrieve Okta IP ranges
%% Returns IP ranges organized by regional cell names.
-spec ip_ranges_json_get() ->
  openapi_utils:response().
ip_ranges_json_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/ip_ranges.json"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

