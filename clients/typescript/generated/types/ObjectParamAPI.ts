import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

import { IpRangesJsonGet200ResponseValue } from '../models/IpRangesJsonGet200ResponseValue';

import { ObservableDefaultApi } from "./ObservableAPI";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";

export interface DefaultApiIpRangesJsonGetRequest {
}

export class ObjectDefaultApi {
    private api: ObservableDefaultApi

    public constructor(configuration: Configuration, requestFactory?: DefaultApiRequestFactory, responseProcessor?: DefaultApiResponseProcessor) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Returns IP ranges organized by regional cell names.
     * Retrieve Okta IP ranges
     * @param param the request object
     */
    public ipRangesJsonGetWithHttpInfo(param: DefaultApiIpRangesJsonGetRequest = {}, options?: Configuration): Promise<HttpInfo<{ [key: string]: IpRangesJsonGet200ResponseValue; }>> {
        return this.api.ipRangesJsonGetWithHttpInfo( options).toPromise();
    }

    /**
     * Returns IP ranges organized by regional cell names.
     * Retrieve Okta IP ranges
     * @param param the request object
     */
    public ipRangesJsonGet(param: DefaultApiIpRangesJsonGetRequest = {}, options?: Configuration): Promise<{ [key: string]: IpRangesJsonGet200ResponseValue; }> {
        return this.api.ipRangesJsonGet( options).toPromise();
    }

}
