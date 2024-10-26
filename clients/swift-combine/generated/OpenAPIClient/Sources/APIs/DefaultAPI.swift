//
// DefaultAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech

import Foundation
import Combine
import OpenAPITransport


open class DefaultAPI {
    private let transport: OpenAPITransport
    public var encoder: JSONEncoder = {
        let encoder = JSONEncoder()
        encoder.dateEncodingStrategy = .formatted(OpenISO8601DateFormatter())
        return encoder
    }()
    public var decoder: JSONDecoder = {
        let decoder = JSONDecoder()
        decoder.dateDecodingStrategy = .formatted(OpenISO8601DateFormatter())
        return decoder
    }()
    public var baseURL = URL(string: "https://s3.amazonaws.com/okta-ip-ranges")

    public init(_ transport: OpenAPITransport) {
        self.transport = transport
    }


    /// Retrieve Okta IP ranges
    /// - GET /ip_ranges.json
    /// - Returns IP ranges organized by regional cell names.
    /// - externalDocs:
    ///     url: https://help.okta.com/en-us/content/topics/security/ip-address-allow-listing.htm 
    ///     description: Okta IP Ranges Documentation 
    /// - returns: AnyPublisher<[String: IpRangesJsonGet200ResponseValue], Error> 
    open func ipRangesJsonGet() -> AnyPublisher<[String: IpRangesJsonGet200ResponseValue], Error> {
        Deferred {
            Result<URLRequest, Error> {
                guard let baseURL = self.transport.baseURL ?? self.baseURL else {
                    throw OpenAPITransportError.badURLError()
                }
                let path = "/ip_ranges.json"
                let url = baseURL.appendingPathComponent(path)
                let components = URLComponents(url: url, resolvingAgainstBaseURL: false)
                guard let requestURL = components?.url else {
                    throw OpenAPITransportError.badURLError()
                }
                var request = URLRequest(url: requestURL)
                request.httpMethod = "GET"
                return request
            }.publisher
        }.flatMap { request -> AnyPublisher<[String: IpRangesJsonGet200ResponseValue], Error> in 
            return self.transport.send(request: request)
                .tryMap { response in
                    try self.decoder.decode([String: IpRangesJsonGet200ResponseValue].self, from: response.data)
                }
                .eraseToAnyPublisher()
        }.eraseToAnyPublisher()
    }
}
