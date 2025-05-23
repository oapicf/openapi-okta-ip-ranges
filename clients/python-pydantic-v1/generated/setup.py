# coding: utf-8

"""
    OpenAPI Okta IP Ranges

    OpenAPI specification and a set of generated API clients for Okta IP Ranges

    The version of the OpenAPI document: 1.0.1-pre.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from setuptools import setup, find_packages  # noqa: H301

# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools
NAME = "openapi-client"
VERSION = "1.0.0"
PYTHON_REQUIRES = ">=3.7"
REQUIRES = [
    "urllib3 >= 1.25.3, < 3.0.0",
    "python-dateutil",
    "pydantic >= 1.10.5, < 2",
    "aenum"
]

setup(
    name=NAME,
    version=VERSION,
    description="OpenAPI Okta IP Ranges",
    author="OpenAPI Okta IP Ranges",
    author_email="blah+oapicf@cliffano.com",
    url="",
    keywords=["OpenAPI", "OpenAPI-Generator", "OpenAPI Okta IP Ranges"],
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    license="MPL-2.0",
    long_description_content_type='text/markdown',
    long_description="""\
    OpenAPI specification and a set of generated API clients for Okta IP Ranges
    """,  # noqa: E501
    package_data={"openapi_client": ["py.typed"]},
)
