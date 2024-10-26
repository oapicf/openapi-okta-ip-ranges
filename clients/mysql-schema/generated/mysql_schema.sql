/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `_ip_ranges_json_get_200_response_value` generated from model 'UnderscoreipUnderscorerangesUnderscorejsonUnderscoregetUnderscore200UnderscoreresponseUnderscorevalue'
-- Object containing IP ranges for a specific regional cell
--

CREATE TABLE IF NOT EXISTS `_ip_ranges_json_get_200_response_value` (
  `ip_ranges` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object containing IP ranges for a specific regional cell';


