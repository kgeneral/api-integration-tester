package com.dykim1983.integration.controller

import com.dykim1983.integration.domain.CommonResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "/index")
class IndexController {
    @GetMapping("")
    fun index() = CommonResponse(200, "Success")
}