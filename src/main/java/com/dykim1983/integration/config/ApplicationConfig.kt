package com.dykim1983.integration.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
open class ApplicationConfig {
    @Bean
    open fun restTemplate() = RestTemplate()
}