/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Retrieve Okta IP ranges
* Returns IP ranges organized by regional cell names.
*
* returns Map
* */
const ip_ranges_jsonGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  ip_ranges_jsonGET,
};
