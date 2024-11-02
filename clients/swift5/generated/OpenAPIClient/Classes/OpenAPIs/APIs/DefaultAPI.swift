//
// DefaultAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

open class DefaultAPI {

    /**
     Retrieve Okta IP ranges
     
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func ipRangesJsonGet(apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: [String: IpRangesJsonGet200ResponseValue]?, _ error: Error?) -> Void)) -> RequestTask {
        return ipRangesJsonGetWithRequestBuilder().execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Retrieve Okta IP ranges
     - GET /ip_ranges.json
     - Returns IP ranges organized by regional cell names.
     - externalDocs: class ExternalDocumentation {
    description: Okta IP Ranges Documentation
    url: https://help.okta.com/en-us/content/topics/security/ip-address-allow-listing.htm
}
     - returns: RequestBuilder<[String: IpRangesJsonGet200ResponseValue]> 
     */
    open class func ipRangesJsonGetWithRequestBuilder() -> RequestBuilder<[String: IpRangesJsonGet200ResponseValue]> {
        let localVariablePath = "/ip_ranges.json"
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        let localVariableUrlComponents = URLComponents(string: localVariableURLString)

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<[String: IpRangesJsonGet200ResponseValue]>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters, requiresAuthentication: false)
    }
}