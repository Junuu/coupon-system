package com.demo.client.common.config

import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.ApplicationListener
import org.springframework.context.annotation.Configuration
import java.security.Security

@Configuration
@EnableConfigurationProperties(FeignClientProperties::class)
@EnableFeignClients(basePackages = ["com.demo.client"])
class FeignClientConfig: ApplicationListener<ApplicationReadyEvent> {
    override fun onApplicationEvent(event: ApplicationReadyEvent) {
        Security.setProperty("networkaddress.cache.ttl","1")
        Security.setProperty("networkaddress.cache.negative.ttl","3")
    }

}