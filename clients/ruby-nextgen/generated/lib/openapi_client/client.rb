# frozen_string_literal: true

module OpenapiClient
  class Client
    attr_reader :configuration, :connection

    def initialize(base_url: nil, **options, &block)
      @configuration = Configuration.new(base_url: base_url, **options, &block)
      @connection = Connection.new(@configuration)
    end

    def ip_ranges_json
      @ip_ranges_json ||= OpenapiClient::Api::IpRangesJson.new(@connection)
    end
  end
end
