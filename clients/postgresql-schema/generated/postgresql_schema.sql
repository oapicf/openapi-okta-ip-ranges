--
-- Schema objects for PostgreSQL
-- "OpenAPI Okta IP Ranges"
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--

--
-- DROP OBJECTS
-- (remove comment prefix to start using DROP commands)
--
-- TABLES
--
-- DROP TABLE IF EXISTS _ip_ranges_json_get_200_response_value;

--
-- TYPES
--


--
-- CREATE OBJECTS
--
-- TYPES
--

--
-- TABLES
--
--
-- Table '_ip_ranges_json_get_200_response_value' generated from model 'UnderscoreipUnderscorerangesUnderscorejsonUnderscoregetUnderscore200UnderscoreresponseUnderscorevalue'
-- Object containing IP ranges for a specific regional cell
--
CREATE TABLE IF NOT EXISTS _ip_ranges_json_get_200_response_value (
    ip_ranges JSON DEFAULT NULL
);
COMMENT ON TABLE _ip_ranges_json_get_200_response_value IS 'Object containing IP ranges for a specific regional cell';

