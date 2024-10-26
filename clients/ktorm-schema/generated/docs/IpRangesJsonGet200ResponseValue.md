
# Table `_ip_ranges_json_get_200_response_value`
(mapped from: IpRangesJsonGet200ResponseValue)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**ipRanges** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]


# **Table `IpRangesJsonGet200ResponseValueIpRanges`**
(mapped from: IpRangesJsonGet200ResponseValueIpRanges)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ipRangesJsonGet200ResponseValue | ipRangesJsonGet200ResponseValue | long | | kotlin.Long | Primary Key | *one*
ipRanges | ipRanges | text | | kotlin.String | Foreign Key | *many*



