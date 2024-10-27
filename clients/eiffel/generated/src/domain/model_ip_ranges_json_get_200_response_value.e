note
 description:"[
		OpenAPI Okta IP Ranges
 		OpenAPI specification and a set of generated API clients for Okta IP Ranges
  		The version of the OpenAPI document: 0.9.0-pre.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class MODEL_IP_RANGES_JSON_GET_200_RESPONSE_VALUE




feature --Access

    ip_ranges: detachable LIST [STRING_32]
      

feature -- Change Element

    set_ip_ranges (a_name: like ip_ranges)
        -- Set 'ip_ranges' with 'a_name'.
      do
        ip_ranges := a_name
      ensure
        ip_ranges_set: ip_ranges = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass MODEL_IP_RANGES_JSON_GET_200_RESPONSE_VALUE%N")
        if attached ip_ranges as l_ip_ranges then
          across l_ip_ranges as ic loop
            Result.append ("%N ip_ranges:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end
