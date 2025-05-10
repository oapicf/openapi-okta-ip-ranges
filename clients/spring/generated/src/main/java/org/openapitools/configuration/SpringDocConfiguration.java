package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("OpenAPI Okta IP Ranges")
                                .description("OpenAPI specification and a set of generated API clients for Okta IP Ranges")
                                .contact(
                                        new Contact()
                                                .name("OpenAPI Okta IP Ranges")
                                                .url("https://github.com/oapicf/openapi-okta-ip-ranges")
                                                .email("blah+oapicf@cliffano.com")
                                )
                                .license(
                                        new License()
                                                .name("MPL-2.0")
                                                .url("http://unlicense.org")
                                )
                                .version("1.0.1-pre.0")
                )
        ;
    }
}