import assert from 'assert';
import OpenapiOktaIpRanges from 'openapi_okta_ip_ranges';

const apiInstance = new OpenapiOktaIpRanges.DefaultApi();

describe('get', function() {
  it('should retrieve Okta IP ranges', function(done) {
    apiInstance.ipRangesJsonGet((error, data, response) => {
      if (!error) {
        console.log('API called successfully. Returned data: ' + data);
        console.log('Okta cells:');
        console.dir(Object.keys(data));
        const cells = [
          'apac_cell_2',
          'emea_cell_2',
          'emea_pam_cell_1',
          'preview_cell_3',
          'preview_pam_cell_1',
          'us_cell_14',
          'us_pam_cell_1'
      ];
      cells.forEach(cell => {
          assert.equal(cell in data, true);
          assert.equal(data[cell].ip_ranges.length >= 1, true);
      });
      }
      done(error);
    });
  });
});
