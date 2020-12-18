package com.springcloud.demo.webclientservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class WebClientServiceApplication

fun main(args: Array<String>) {
	runApplication<WebClientServiceApplication>(*args)
}
