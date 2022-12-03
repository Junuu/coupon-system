package com.demo.client.common.annotation

import com.demo.client.common.config.FeignClientConfig
import org.springframework.context.annotation.Import

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Import(FeignClientConfig::class)
annotation class EnableClient()
