import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.ip_ranges_json_get200_response_value import IpRangesJsonGet200ResponseValue  # noqa: E501
from openapi_server import util


def ip_ranges_json_get():  # noqa: E501
    """Retrieve Okta IP ranges

    Returns IP ranges organized by regional cell names. # noqa: E501


    :rtype: Union[Dict[str, IpRangesJsonGet200ResponseValue], Tuple[Dict[str, IpRangesJsonGet200ResponseValue], int], Tuple[Dict[str, IpRangesJsonGet200ResponseValue], int, Dict[str, str]]
    """
    return 'do some magic!'
