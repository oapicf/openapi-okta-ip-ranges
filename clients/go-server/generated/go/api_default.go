// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * OpenAPI Okta IP Ranges
 *
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * API version: 0.10.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi

import (
	"net/http"
	"strings"
)

// DefaultAPIController binds http requests to an api service and writes the service results to the http response
type DefaultAPIController struct {
	service DefaultAPIServicer
	errorHandler ErrorHandler
}

// DefaultAPIOption for how the controller is set up.
type DefaultAPIOption func(*DefaultAPIController)

// WithDefaultAPIErrorHandler inject ErrorHandler into controller
func WithDefaultAPIErrorHandler(h ErrorHandler) DefaultAPIOption {
	return func(c *DefaultAPIController) {
		c.errorHandler = h
	}
}

// NewDefaultAPIController creates a default api controller
func NewDefaultAPIController(s DefaultAPIServicer, opts ...DefaultAPIOption) *DefaultAPIController {
	controller := &DefaultAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the DefaultAPIController
func (c *DefaultAPIController) Routes() Routes {
	return Routes{
		"IpRangesJsonGet": Route{
			strings.ToUpper("Get"),
			"/okta-ip-ranges/ip_ranges.json",
			c.IpRangesJsonGet,
		},
	}
}

// IpRangesJsonGet - Retrieve Okta IP ranges
func (c *DefaultAPIController) IpRangesJsonGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.IpRangesJsonGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}
