@isTest
private class OASDefaultApiTest {
    /**
     * Retrieve Okta IP ranges
     *
     * Returns IP ranges organized by regional cell names.
     */
    @isTest
    private static void ipRangesJsonGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASDefaultApi api;
        Map<String, OASIpRangesJsonGet200ResponseValue> response;
        Map<String, OASIpRangesJsonGet200ResponseValue> expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.ipRangesJsonGet();
    }
}