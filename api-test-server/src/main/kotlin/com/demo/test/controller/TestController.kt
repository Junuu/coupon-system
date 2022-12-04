package com.demo.test.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test/{params}")
    fun test(@PathVariable params: String): String{
        val result = when(params){
            "1" -> "This is Test Server"
            else -> throw IllegalArgumentException("error")
        }
        return result
    }
}