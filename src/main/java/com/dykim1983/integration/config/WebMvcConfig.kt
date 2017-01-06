package com.dykim1983.integration.config

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@Configuration
// @EnableWebMvc
open class WebMvcConfig : WebMvcConfigurerAdapter() {

    override fun configureContentNegotiation(configurer: ContentNegotiationConfigurer) {
        configurer
                .defaultContentType(MediaType.APPLICATION_JSON)
                .mediaType("html", MediaType.TEXT_HTML)
    }

    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/")
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/")
    }

    override fun configureMessageConverters(converters: MutableList<HttpMessageConverter<*>>) {
        converters.add(jsonConverter())
    }

    private fun jsonConverter(): MappingJackson2HttpMessageConverter =
            MappingJackson2HttpMessageConverter(ObjectMapper())

}