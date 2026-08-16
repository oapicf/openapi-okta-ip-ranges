import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';


@Injectable()
export abstract class DefaultApi {

  abstract ipRangesJsonGet( request: Request): { [key: string]: IpRangesJsonGet200ResponseValue; } | Promise<{ [key: string]: IpRangesJsonGet200ResponseValue; }> | Observable<{ [key: string]: IpRangesJsonGet200ResponseValue; }>;

} 