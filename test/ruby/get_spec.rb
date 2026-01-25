require 'openapi_okta_ip_ranges'

describe 'OpenapiOktaIpRangesClient' do
  before do
  end

  after do
  end

  describe 'test get' do
    it 'should retrieve Okta IP ranges' do
      api_instance = OpenApiOktaIpRangesClient::DefaultApi.new
      begin
        result = api_instance.ip_ranges_json_get
        expect(result).not_to be_nil
        puts 'Okta cells:'
        puts result.keys
        cells = [
          'apac_cell_2',
          'emea_cell_2',
          'emea_pam_cell_1',
          'preview_cell_3',
          'preview_pam_cell_1',
          'us_cell_14',
          'us_pam_cell_1'
        ]
        cells.each do |cell|
          puts "IP ranges for cell: #{cell}"
          expect(cells.include?(cell)).to eq(true)
        end
      rescue OpenApiOktaIpRangesClient::ApiError => e
        puts "Error when calling DefaultApi->ip_ranges_json_get: #{e}"
        fail
      end
    end
  end

end