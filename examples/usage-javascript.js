var OpenapiOktaIpRanges = require('openapi_okta_ip_ranges');

var api = new OpenapiOktaIpRanges.DefaultApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
    process.exitCode = 1;
  } else {
    console.log('API called successfully. Returned data: ' + data);
    console.log('Okta cells:');
    console.dir(Object.keys(data));
  }
};
api.ipRangesJsonGet(callback);
