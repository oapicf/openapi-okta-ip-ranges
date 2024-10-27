//
// IpRangesJsonGet200ResponseValue.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/// Object containing IP ranges for a specific regional cell 
public struct IpRangesJsonGet200ResponseValue: Codable {
    public var ipRanges: [String]?

    public init(ipRanges: [String]? = nil) {
        self.ipRanges = ipRanges
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case ipRanges = "ip_ranges"
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        ipRanges = try container.decodeIfPresent([String].self, forKey: .ipRanges)
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(ipRanges, forKey: .ipRanges)
    }
}