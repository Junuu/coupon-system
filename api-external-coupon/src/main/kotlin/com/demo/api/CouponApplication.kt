package com.demo.api

import com.demo.client.common.annotation.EnableClient
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@EnableClient
@ConfigurationPropertiesScan
@SpringBootApplication
class CouponApplication

fun main(args: Array<String>) {
	runApplication<CouponApplication>(*args)
}
