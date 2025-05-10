# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from typing import Dict
from openapi_server.models.ip_ranges_json_get200_response_value import IpRangesJsonGet200ResponseValue


class BaseDefaultApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseDefaultApi.subclasses = BaseDefaultApi.subclasses + (cls,)
    async def ip_ranges_json_get(
        self,
    ) -> Dict[str, IpRangesJsonGet200ResponseValue]:
        """Returns IP ranges organized by regional cell names."""
        ...
