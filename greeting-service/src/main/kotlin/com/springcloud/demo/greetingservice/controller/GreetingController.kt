package com.springcloud.demo.greetingservice.controller

import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class GreetingController {

    @GetMapping("/greet/{name}")
    fun greet(@PathVariable name: String): Map<String, String> {
        return Collections.singletonMap("greeting", "Hello, $name!")
    }
}