/*
OpenAPI Okta IP Ranges

OpenAPI specification and a set of generated API clients for Okta IP Ranges

API version: 0.10.1-pre.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// checks if the IpRangesJsonGet200ResponseValue type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &IpRangesJsonGet200ResponseValue{}

// IpRangesJsonGet200ResponseValue Object containing IP ranges for a specific regional cell
type IpRangesJsonGet200ResponseValue struct {
	IpRanges []string `json:"ip_ranges,omitempty"`
}

// NewIpRangesJsonGet200ResponseValue instantiates a new IpRangesJsonGet200ResponseValue object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewIpRangesJsonGet200ResponseValue() *IpRangesJsonGet200ResponseValue {
	this := IpRangesJsonGet200ResponseValue{}
	return &this
}

// NewIpRangesJsonGet200ResponseValueWithDefaults instantiates a new IpRangesJsonGet200ResponseValue object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewIpRangesJsonGet200ResponseValueWithDefaults() *IpRangesJsonGet200ResponseValue {
	this := IpRangesJsonGet200ResponseValue{}
	return &this
}

// GetIpRanges returns the IpRanges field value if set, zero value otherwise.
func (o *IpRangesJsonGet200ResponseValue) GetIpRanges() []string {
	if o == nil || IsNil(o.IpRanges) {
		var ret []string
		return ret
	}
	return o.IpRanges
}

// GetIpRangesOk returns a tuple with the IpRanges field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IpRangesJsonGet200ResponseValue) GetIpRangesOk() ([]string, bool) {
	if o == nil || IsNil(o.IpRanges) {
		return nil, false
	}
	return o.IpRanges, true
}

// HasIpRanges returns a boolean if a field has been set.
func (o *IpRangesJsonGet200ResponseValue) HasIpRanges() bool {
	if o != nil && !IsNil(o.IpRanges) {
		return true
	}

	return false
}

// SetIpRanges gets a reference to the given []string and assigns it to the IpRanges field.
func (o *IpRangesJsonGet200ResponseValue) SetIpRanges(v []string) {
	o.IpRanges = v
}

func (o IpRangesJsonGet200ResponseValue) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o IpRangesJsonGet200ResponseValue) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.IpRanges) {
		toSerialize["ip_ranges"] = o.IpRanges
	}
	return toSerialize, nil
}

type NullableIpRangesJsonGet200ResponseValue struct {
	value *IpRangesJsonGet200ResponseValue
	isSet bool
}

func (v NullableIpRangesJsonGet200ResponseValue) Get() *IpRangesJsonGet200ResponseValue {
	return v.value
}

func (v *NullableIpRangesJsonGet200ResponseValue) Set(val *IpRangesJsonGet200ResponseValue) {
	v.value = val
	v.isSet = true
}

func (v NullableIpRangesJsonGet200ResponseValue) IsSet() bool {
	return v.isSet
}

func (v *NullableIpRangesJsonGet200ResponseValue) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableIpRangesJsonGet200ResponseValue(val *IpRangesJsonGet200ResponseValue) *NullableIpRangesJsonGet200ResponseValue {
	return &NullableIpRangesJsonGet200ResponseValue{value: val, isSet: true}
}

func (v NullableIpRangesJsonGet200ResponseValue) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableIpRangesJsonGet200ResponseValue) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


