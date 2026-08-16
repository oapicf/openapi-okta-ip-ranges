<a name="__pageTop"></a>
# DefaultApi   { #DefaultApi }


All URIs are relative to *https://s3.amazonaws.com/okta-ip-ranges*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ip_ranges_json_get**](#ip_ranges_json_get) | **GET** `/ip_ranges.json` | Retrieve Okta IP ranges

# **ip_ranges_json_get**   { #ip_ranges_json_get }
<a name="ip_ranges_json_get"></a>

> `ip_ranges_json_get( on_success: Callable, on_failure: Callable)`

Retrieve Okta IP ranges

Returns IP ranges organized by regional cell names.

### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.ip_ranges_json_get(
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ip_ranges_json_get", response)
		assert(response.data is _ip_ranges_json_get_200_response_value)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

No authorization required.

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

