package com.demo.client.test.config

import com.demo.client.common.config.FeignClientProperties
import feign.RequestInterceptor
import feign.RequestTemplate
import org.springframework.context.annotation.Bean

class TestConfiguration(
    private val feignClientProperties: FeignClientProperties,
) {

    @Bean
    fun connectionManagerRequestInterceptor(): RequestInterceptor{
        return MessageRequestInterceptor(feignClientProperties)
    }

    class MessageRequestInterceptor(
        private val feignClientProperties: FeignClientProperties
    ) : RequestInterceptor{
        override fun apply(template: RequestTemplate) {
            template.header("Content-Type","application/json")
        }

    }
}