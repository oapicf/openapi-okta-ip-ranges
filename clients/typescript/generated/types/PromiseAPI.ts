import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

import { IpRangesJsonGet200ResponseValue } from '../models/IpRangesJsonGet200ResponseValue';
import { ObservableDefaultApi } from './ObservableAPI';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
export class PromiseDefaultApi {
    private api: ObservableDefaultApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DefaultApiRequestFactory,
        responseProcessor?: DefaultApiResponseProcessor
    ) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Returns IP ranges organized by regional cell names.
     * Retrieve Okta IP ranges
     */
    public ipRangesJsonGetWithHttpInfo(_options?: Configuration): Promise<HttpInfo<{ [key: string]: IpRangesJsonGet200ResponseValue; }>> {
        const result = this.api.ipRangesJsonGetWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Returns IP ranges organized by regional cell names.
     * Retrieve Okta IP ranges
     */
    public ipRangesJsonGet(_options?: Configuration): Promise<{ [key: string]: IpRangesJsonGet200ResponseValue; }> {
        const result = this.api.ipRangesJsonGet(_options);
        return result.toPromise();
    }


}



