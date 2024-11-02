const samples = require('../samples/DefaultApi');
const _ip_ranges_json_get_200_response_value = require('../models/_ip_ranges_json_get_200_response_value');
const utils = require('../utils/utils');

module.exports = {
    ipRangesJsonGet: {
        key: 'ipRangesJsonGet',
        noun: 'default',
        display: {
            label: 'Retrieve Okta IP ranges',
            description: 'Returns IP ranges organized by regional cell names.',
            hidden: false,
        },
        operation: {
            inputFields: [
            ],
            outputFields: [
                ...object.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://s3.amazonaws.com/okta-ip-ranges/ip_ranges.json'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'ipRangesJsonGet', response.json);
                    return results;
                })
            },
            sample: samples['_ip_ranges_json_get_200_response_valueSample']
        }
    },
}
