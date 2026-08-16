# frozen_string_literal: true

module OpenapiClient
  module Api
    class IpRangesJson
      def initialize(connection)
        @connection = connection
      end

      def list
        @connection.call(
          :GET,
          '/ip_ranges.json',
          type: nil,
          auth: []
        )
      end
    end
  end
end
