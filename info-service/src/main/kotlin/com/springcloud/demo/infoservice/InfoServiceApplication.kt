package com.springcloud.demo.infoservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class InfoServiceApplication

fun main(args: Array<String>) {
	runApplication<InfoServiceApplication>(*args)
}
