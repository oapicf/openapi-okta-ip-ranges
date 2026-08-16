terraform {
  required_providers {
    example = {
      source = "registry.terraform.io/example/example"
    }
  }
}

provider "example" {
  endpoint = "https://s3.amazonaws.com/okta-ip-ranges"
  # api_key  = "your-api-key"
  # token    = "your-bearer-token"
}
