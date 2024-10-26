require 'json'


MyApp.add_route('GET', '/okta-ip-ranges/ip_ranges.json', {
  "resourcePath" => "/Default",
  "summary" => "Retrieve Okta IP ranges",
  "nickname" => "ip_ranges_json_get",
  "responseClass" => "Hash<String, _ip_ranges_json_get_200_response_value>",
  "endpoint" => "/ip_ranges.json",
  "notes" => "Returns IP ranges organized by regional cell names.",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

