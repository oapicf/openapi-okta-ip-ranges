# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for OpenAPI Okta IP Ranges 0.9.0-pre.0 Tiny client cpp (Arduino) 

The project is structured like this:
```
samples/client/petstore/tiny/cpp/
├── lib
│   ├── Models
│   ├── service
│   └── TestFiles
├── platformio.ini
├── pre_compiling_bourne.py
├── README.md
├── root.cert
├── src
│   └── main.cpp
└── test
    └── RunTests.cpp
```

All URIs are relative to https://s3.amazonaws.comhttps://s3.amazonaws.com/okta-ip-ranges

### DefaultApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*ipRangesJsonGet* | *GET* /ip_ranges.json | Retrieve Okta IP ranges.|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*_ip_ranges_json_get_200_response_value* | Object containing IP ranges for a specific regional cell|

