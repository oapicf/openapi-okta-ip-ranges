import connexion

from app.openapi_server.models.ip_ranges_json_get200_response_value import IpRangesJsonGet200ResponseValue  # noqa: E501
from openapi_server import util


def ip_ranges_json_get():  # noqa: E501
    """Retrieve Okta IP ranges

    Returns IP ranges organized by regional cell names. # noqa: E501


    :rtype: Dict[str, IpRangesJsonGet200ResponseValue]
    """
    return 'do some magic!'
