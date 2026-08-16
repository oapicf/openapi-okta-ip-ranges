# Load the gem
require 'openapi_okta_ip_ranges'

api_instance = OpenApiOktaIpRangesClient::DefaultApi.new

begin
  # Get Okta IP ranges
  result = api_instance.ip_ranges_json_get
  puts 'Okta cells:'
  puts result.keys
rescue OpenApiOktaIpRangesClient::ApiError => e
  puts "Exception when calling DefaultApi->ip_ranges_json_get: #{e}"
  raise
end
