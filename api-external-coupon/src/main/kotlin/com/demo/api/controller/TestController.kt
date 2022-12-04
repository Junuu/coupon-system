package com.demo.api.controller

import com.demo.client.test.client.TestClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val testClient: TestClient
) {
    @GetMapping("/test/{params}")
    fun test(@PathVariable params: String): String{
        return testClient.requestTestServer(params)
    }
}