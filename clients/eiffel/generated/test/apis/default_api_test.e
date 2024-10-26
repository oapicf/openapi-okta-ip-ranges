note
    description: "API tests for DEFAULT_API"
    date: "$Date$"
    revision: "$Revision$"


class DEFAULT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_ip_ranges_json_get
            -- Retrieve Okta IP ranges
            --
            -- Returns IP ranges organized by regional cell names.
        local
            l_response: STRING_TABLE [MODEL_IP_RANGES_JSON_GET_200_RESPONSE_VALUE]
        do
            -- TODO: Initialize required params.

            -- l_response := api.ip_ranges_json_get
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: DEFAULT_API
            -- Create an object instance of `DEFAULT_API'.
        once
            create { DEFAULT_API } Result
        end

end
