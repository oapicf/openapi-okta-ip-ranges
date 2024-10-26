# -*- encoding: utf-8 -*-

=begin
#OpenAPI Okta IP Ranges

#OpenAPI specification and a set of generated API clients for Okta IP Ranges

The version of the OpenAPI document: 0.9.0-pre.0
Contact: blah+oapicf@cliffano.com
Generated by: https://openapi-generator.tech
Generator version: 7.6.0

=end

$:.push File.expand_path("../lib", __FILE__)
require "openapi_okta_ip_ranges/version"

Gem::Specification.new do |s|
  s.name        = "openapi_okta_ip_ranges"
  s.version     = OpenApiIplocationClient::VERSION
  s.platform    = Gem::Platform::RUBY
  s.authors     = ["OpenAPI Clients Factory"]
  s.email       = ["blah+oapicf@cliffano.com"]
  s.homepage    = "https://github.com/oapicf/openapi-okta-ip-ranges"
  s.summary     = "OpenAPI Okta IP Ranges Ruby Gem"
  s.description = "OpenAPI specification and a set of generated API clients for Okta IP Ranges"
  s.license     = "MPL-2.0"
  s.required_ruby_version = ">= 2.0"
  s.metadata    = {}

  s.add_runtime_dependency 'typhoeus', '~> 1.0', '>= 1.0.1'

  s.add_development_dependency 'rspec', '~> 3.6', '>= 3.6.0'

  s.files         = `find *`.split("\n").uniq.sort.select { |f| !f.empty? }
  s.test_files    = `find spec/*`.split("\n")
  s.executables   = []
  s.require_paths = ["lib"]
end
