import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, PromiseConfigurationOptions, wrapOptions } from '../configuration'
import { PromiseMiddleware, Middleware, PromiseMiddlewareWrapper } from '../middleware';

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
    public ipRangesJsonGetWithHttpInfo(_options?: PromiseConfigurationOptions): Promise<HttpInfo<{ [key: string]: IpRangesJsonGet200ResponseValue; }>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.ipRangesJsonGetWithHttpInfo(observableOptions);
        return result.toPromise();
    }

    /**
     * Returns IP ranges organized by regional cell names.
     * Retrieve Okta IP ranges
     */
    public ipRangesJsonGet(_options?: PromiseConfigurationOptions): Promise<{ [key: string]: IpRangesJsonGet200ResponseValue; }> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.ipRangesJsonGet(observableOptions);
        return result.toPromise();
    }


}



