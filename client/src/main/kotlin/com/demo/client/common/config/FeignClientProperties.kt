package com.demo.client.common.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "coupon.clients")
class FeignClientProperties(
    val test: Test,
) {
    companion object{
        data class Test(
            val endpoint: String,
        )
    }
}