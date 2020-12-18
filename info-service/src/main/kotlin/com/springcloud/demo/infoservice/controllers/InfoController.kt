package com.springcloud.demo.infoservice.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class InfoController {

    @GetMapping("/info")
    fun getInfo(): String {
        return Calendar.getInstance().time.toString()
    }
}