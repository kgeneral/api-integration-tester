package com.dykim1983.integration.controller

import com.dykim1983.integration.domain.CommonResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestOperationsExtension.getForObject
import org.springframework.web.client.RestTemplate

@RestController
@RequestMapping(value = "/index")
class IndexController(val restTemplate : RestTemplate) {
    @GetMapping("")
    fun index() = CommonResponse(200, "Success")

    @GetMapping("curl")
    fun curl() : CommonResponse = restTemplate.getForObject("http://localhost:9000/index")

}