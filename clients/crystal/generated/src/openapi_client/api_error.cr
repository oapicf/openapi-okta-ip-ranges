# #OpenAPI Okta IP Ranges
#
##OpenAPI specification and a set of generated API clients for Okta IP Ranges
#
#The version of the OpenAPI document: 0.9.0-pre.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.6.0
#

module OpenAPIClient
  class ApiError < Exception
    getter code : Int32?
    getter response_headers : Hash(String, Array(String) | String)?

    # Usage examples:
    #   ApiError.new
    #   ApiError.new(message: "message")
    #   ApiError.new(code: 500, response_headers: {}, message: "")
    #   ApiError.new(code: 404, message: "Not Found")
    def initialize(@code , @message, @response_headers)
    end

    def initialize(@code , @message)
    end

    # Override to_s to display a friendly error message
    def to_s
      msg = ""
      msg = msg + "\nHTTP status code: #{code}" if @code
      msg = msg + "\nResponse headers: #{response_headers}" if @response_headers
      if @message.nil? || @message.empty?
        msg = msg + "\nError message: the server returns an error but the HTTP response body is empty."
      else
        msg = msg + "\nResponse body: #{@message}"
      end

      msg
    end
  end
end
