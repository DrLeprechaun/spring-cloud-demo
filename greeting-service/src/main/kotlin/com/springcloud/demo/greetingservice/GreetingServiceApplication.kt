package com.springcloud.demo.greetingservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class GreetingServiceApplication

fun main(args: Array<String>) {
	runApplication<GreetingServiceApplication>(*args)
}
