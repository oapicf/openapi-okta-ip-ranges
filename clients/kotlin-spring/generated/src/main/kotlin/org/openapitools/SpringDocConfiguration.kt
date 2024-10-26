package org.openapitools

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.security.SecurityScheme

@Configuration
class SpringDocConfiguration {

    @Bean
    fun apiInfo(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("OpenAPI Okta IP Ranges")
                    .description("OpenAPI specification and a set of generated API clients for Okta IP Ranges")
                    .contact(
                        Contact()
                            .name("OpenAPI Okta IP Ranges")
                            .url("https://github.com/oapicf/openapi-okta-ip-ranges")
                            .email("blah+oapicf@cliffano.com")
                    )
                    .license(
                        License()
                            .name("MPL-2.0")
                                                )
                    .version("0.9.0-pre.0")
            )
    }
}
