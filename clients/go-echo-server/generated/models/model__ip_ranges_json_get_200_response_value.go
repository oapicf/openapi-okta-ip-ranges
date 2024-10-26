package models

// IpRangesJsonGet200ResponseValue - Object containing IP ranges for a specific regional cell
type IpRangesJsonGet200ResponseValue struct {

	IpRanges []string `json:"ip_ranges,omitempty"`
}
