import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { DefaultApi } from '../api';

@Controller()
export class DefaultApiController {
  constructor(private readonly defaultApi: DefaultApi) {}

  @Get('/ip_ranges.json')
  ipRangesJsonGet(@Req() request: Request): { [key: string]: IpRangesJsonGet200ResponseValue; } | Promise<{ [key: string]: IpRangesJsonGet200ResponseValue; }> | Observable<{ [key: string]: IpRangesJsonGet200ResponseValue; }> {
    return this.defaultApi.ipRangesJsonGet(request);
  }

} 