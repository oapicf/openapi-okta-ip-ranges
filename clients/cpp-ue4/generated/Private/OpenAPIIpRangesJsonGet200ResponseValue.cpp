/**
 * OpenAPI Okta IP Ranges
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * OpenAPI spec version: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#include "OpenAPIIpRangesJsonGet200ResponseValue.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIIpRangesJsonGet200ResponseValue::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (IpRanges.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("ip_ranges")); WriteJsonValue(Writer, IpRanges.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIIpRangesJsonGet200ResponseValue::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("ip_ranges"), IpRanges);

	return ParseSuccess;
}

}
