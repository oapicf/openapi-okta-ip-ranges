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
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.OpenApiOktaIpRanges);
  }
}(this, function(expect, OpenApiOktaIpRanges) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new OpenApiOktaIpRanges.IpRangesJsonGet200ResponseValue();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('IpRangesJsonGet200ResponseValue', function() {
    it('should create an instance of IpRangesJsonGet200ResponseValue', function() {
      // uncomment below and update the code to test IpRangesJsonGet200ResponseValue
      //var instance = new OpenApiOktaIpRanges.IpRangesJsonGet200ResponseValue();
      //expect(instance).to.be.a(OpenApiOktaIpRanges.IpRangesJsonGet200ResponseValue);
    });

    it('should have the property ipRanges (base name: "ip_ranges")', function() {
      // uncomment below and update the code to test the property ipRanges
      //var instance = new OpenApiOktaIpRanges.IpRangesJsonGet200ResponseValue();
      //expect(instance).to.be();
    });

  });

}));
