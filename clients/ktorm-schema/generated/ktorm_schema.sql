

-- --------------------------------------------------------------------------
-- Table structure for table `_ip_ranges_json_get_200_response_value` generated from model 'ipRangesJsonGet200ResponseValue'
-- Object containing IP ranges for a specific regional cell
--

CREATE TABLE IF NOT EXISTS `_ip_ranges_json_get_200_response_value` (
);  /*Object containing IP ranges for a specific regional cell*/

-- --------------------------------------------------------------------------
-- Table structure for table `IpRangesJsonGet200ResponseValueIpRanges` generated from model 'IpRangesJsonGet200ResponseValueIpRanges'

CREATE TABLE IF NOT EXISTS `IpRangesJsonGet200ResponseValueIpRanges` (
  `ipRangesJsonGet200ResponseValue` long NOT NULL
  `ipRanges` text NOT NULL
);



--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
