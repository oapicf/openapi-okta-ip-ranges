# IpRangesJsonGet200ResponseValue

Object containing IP ranges for a specific regional cell

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ip_ranges** | **List[str]** |  | [optional] 

## Example

```python
from openapi_client.models.ip_ranges_json_get200_response_value import IpRangesJsonGet200ResponseValue

# TODO update the JSON string below
json = "{}"
# create an instance of IpRangesJsonGet200ResponseValue from a JSON string
ip_ranges_json_get200_response_value_instance = IpRangesJsonGet200ResponseValue.from_json(json)
# print the JSON string representation of the object
print IpRangesJsonGet200ResponseValue.to_json()

# convert the object into a dict
ip_ranges_json_get200_response_value_dict = ip_ranges_json_get200_response_value_instance.to_dict()
# create an instance of IpRangesJsonGet200ResponseValue from a dict
ip_ranges_json_get200_response_value_from_dict = IpRangesJsonGet200ResponseValue.from_dict(ip_ranges_json_get200_response_value_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


