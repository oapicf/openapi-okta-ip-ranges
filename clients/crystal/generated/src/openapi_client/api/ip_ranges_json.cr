require "json"

module OpenAPIClient
  module Api
  class IpRangesJson
    def initialize(@conn : Connection); end

    # Retrieve Okta IP ranges Returns IP ranges organized by regional cell names.
    def list() : Response(Hash(String, OpenAPIClient::IpRangesJsonGet200ResponseValue))
      @conn.request(Hash(String, OpenAPIClient::IpRangesJsonGet200ResponseValue),
        method: :GET,
        path: "/ip_ranges.json",
        accept: %w[application/json],
        auth: %w[])
    end
  end
  end

end
