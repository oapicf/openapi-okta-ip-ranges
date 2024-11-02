#import <Foundation/Foundation.h>
#import "OAIIpRangesJsonGet200ResponseValue.h"
#import "OAIApi.h"

/**
* OpenAPI Okta IP Ranges
* OpenAPI specification and a set of generated API clients for Okta IP Ranges
*
* The version of the OpenAPI document: 0.10.1-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/



@interface OAIDefaultApi: NSObject <OAIApi>

extern NSString* kOAIDefaultApiErrorDomain;
extern NSInteger kOAIDefaultApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Retrieve Okta IP ranges
/// Returns IP ranges organized by regional cell names.
///
/// 
///  code:200 message:"A JSON object of regional cells with IP ranges."
///
/// @return NSDictionary<OAIIpRangesJsonGet200ResponseValue>*
-(NSURLSessionTask*) ipRangesJsonGetWithCompletionHandler: 
    (void (^)(NSDictionary<OAIIpRangesJsonGet200ResponseValue>* output, NSError* error)) handler;



@end
