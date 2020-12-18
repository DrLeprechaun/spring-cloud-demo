package com.springcloud.demo.webclientservice.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.ui.Model;

@Controller
class WebClientController {

    @GetMapping("/")
    fun handleRequest(model: Model): String {
        model.addAttribute("msg", "Web Client Service")
        return "index"
    }
}