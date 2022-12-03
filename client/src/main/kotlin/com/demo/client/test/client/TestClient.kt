package com.demo.client.test.client

import com.demo.client.test.config.TestConfiguration
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
    name = "test",
    url = "\${coupon.clients.test.endpoint:sample.com}",
    configuration = [TestConfiguration::class]
)
interface TestClient {
    @GetMapping("/test/{params}")
    fun requestTestServer(@PathVariable params: String): String
}