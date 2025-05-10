import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, ConfigurationOptions, PromiseConfigurationOptions } from '../configuration'
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
        let observableOptions: undefined | ConfigurationOptions
        if (_options){
	    observableOptions = {
                baseServer: _options.baseServer,
                httpApi: _options.httpApi,
                middleware: _options.middleware?.map(
                    m => new PromiseMiddlewareWrapper(m)
		),
		middlewareMergeStrategy: _options.middlewareMergeStrategy,
                authMethods: _options.authMethods
	    }
	}
        const result = this.api.ipRangesJsonGetWithHttpInfo(observableOptions);
        return result.toPromise();
    }

    /**
     * Returns IP ranges organized by regional cell names.
     * Retrieve Okta IP ranges
     */
    public ipRangesJsonGet(_options?: PromiseConfigurationOptions): Promise<{ [key: string]: IpRangesJsonGet200ResponseValue; }> {
        let observableOptions: undefined | ConfigurationOptions
        if (_options){
	    observableOptions = {
                baseServer: _options.baseServer,
                httpApi: _options.httpApi,
                middleware: _options.middleware?.map(
                    m => new PromiseMiddlewareWrapper(m)
		),
		middlewareMergeStrategy: _options.middlewareMergeStrategy,
                authMethods: _options.authMethods
	    }
	}
        const result = this.api.ipRangesJsonGet(observableOptions);
        return result.toPromise();
    }


}



