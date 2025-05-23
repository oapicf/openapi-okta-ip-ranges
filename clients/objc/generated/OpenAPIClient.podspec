#
# Be sure to run `pod lib lint OpenAPIClient.podspec' to ensure this is a
# valid spec and remove all comments before submitting the spec.
#
# Any lines starting with a # are optional, but encouraged
#
# To learn more about a Podspec see http://guides.cocoapods.org/syntax/podspec.html
#

Pod::Spec.new do |s|
    s.name             = "OpenAPIClient"
    s.version          = "1.0.0"

    s.summary          = "OpenAPI Okta IP Ranges"
    s.description      = <<-DESC
                         OpenAPI specification and a set of generated API clients for Okta IP Ranges
                         DESC

    s.platform     = :ios, '7.0'
    s.requires_arc = true

    s.framework    = 'SystemConfiguration'

    s.homepage     = "https://github.com/openapitools/openapi-generator"
    s.license      = "Proprietary"
    s.source       = { :git => "https://github.com/openapitools/openapi-generator.git", :tag => "#{s.version}" }
    s.author       = { "OpenAPI" => "team@openapitools.org" }

    s.source_files = 'OpenAPIClient/**/*.{m,h}'
    s.public_header_files = 'OpenAPIClient/**/*.h'


    s.dependency 'AFNetworking', '~> 3'
    s.dependency 'JSONModel', '~> 1.2'
    s.dependency 'ISO8601', '~> 0.6'
end
