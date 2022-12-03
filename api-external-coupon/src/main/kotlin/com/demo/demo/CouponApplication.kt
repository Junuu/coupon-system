package com.demo.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CouponApplication

fun main(args: Array<String>) {
	runApplication<CouponApplication>(*args)
}
