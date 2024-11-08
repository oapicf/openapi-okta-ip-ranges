# Helidon SE Server with OpenAPI

## Build and run

With JDK11+
```bash
mvn package
java -jar target/openapi-java-server.jar
```

## Exercise the application

```
curl -X GET https://s3.amazonaws.com/okta-ip-ranges/ip_ranges.json

```

## Try health and metrics

```
curl -s -X GET https://s3.amazonaws.com/okta-ip-ranges/health
{"outcome":"UP",...
. . .

# Prometheus Format
curl -s -X GET https://s3.amazonaws.com/okta-ip-ranges/metrics
# TYPE base:gc_g1_young_generation_count gauge
. . .

# JSON Format
curl -H 'Accept: application/json' -X GET https://s3.amazonaws.com/okta-ip-ranges/metrics
{"base":...
. . .
```