# Go Echo API Server for openapi

OpenAPI specification and a set of generated API clients for Okta IP Ranges

## Overview
This server was generated by the [openapi-generator]
(https://openapi-generator.tech) project.
By using the [OpenAPI-Spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate a server stub.
-

To see how to make this your own, look here:

[README](https://openapi-generator.tech)

- API version: 0.9.0-pre.0
- Build date: 2024-10-26T04:00:20.929332886Z[Etc/UTC]
- Generator version: 7.6.0
For more information, please visit [https://github.com/oapicf/openapi-okta-ip-ranges](https://github.com/oapicf/openapi-okta-ip-ranges)

### Running the server

To run the server, follow these simple steps:

```
go mod download
go build -o app
```

To run the server in a docker container
```
docker build --network=host -t openapi .
```

Once the image is built, just run
```
docker run --rm -it openapi
```

### Known Issue

TBA