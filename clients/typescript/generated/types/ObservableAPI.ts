import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
import { IpRangesJsonGet200ResponseValue } from '../models/IpRangesJsonGet200ResponseValue';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
export class ObservableDefaultApi {
    private requestFactory: DefaultApiRequestFactory;
    private responseProcessor: DefaultApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: DefaultApiRequestFactory,
        responseProcessor?: DefaultApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new DefaultApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new DefaultApiResponseProcessor();
    }

    /**
     * Returns IP ranges organized by regional cell names.
     * Retrieve Okta IP ranges
     */
    public ipRangesJsonGetWithHttpInfo(_options?: Configuration): Observable<HttpInfo<{ [key: string]: IpRangesJsonGet200ResponseValue; }>> {
        const requestContextPromise = this.requestFactory.ipRangesJsonGet(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.ipRangesJsonGetWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns IP ranges organized by regional cell names.
     * Retrieve Okta IP ranges
     */
    public ipRangesJsonGet(_options?: Configuration): Observable<{ [key: string]: IpRangesJsonGet200ResponseValue; }> {
        return this.ipRangesJsonGetWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<{ [key: string]: IpRangesJsonGet200ResponseValue; }>) => apiResponse.data));
    }

}
