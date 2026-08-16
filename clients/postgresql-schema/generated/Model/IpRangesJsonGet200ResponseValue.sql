--
-- "OpenAPI Okta IP Ranges"
-- Prepared SQL queries for '_ip_ranges_json_get_200_response_value' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table '_ip_ranges_json_get_200_response_value'
--
SELECT ip_ranges FROM _ip_ranges_json_get_200_response_value WHERE 1=1;

--
-- INSERT template for table '_ip_ranges_json_get_200_response_value'
--
INSERT INTO _ip_ranges_json_get_200_response_value (ip_ranges) VALUES (?);

--
-- UPDATE template for table '_ip_ranges_json_get_200_response_value'
--
UPDATE _ip_ranges_json_get_200_response_value SET ip_ranges = ? WHERE 1=2;

--
-- DELETE template for table '_ip_ranges_json_get_200_response_value'
--
DELETE FROM _ip_ranges_json_get_200_response_value WHERE 1=2;

