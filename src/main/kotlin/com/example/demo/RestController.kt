package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController {
    @GetMapping("/rest-with-object")
    fun welcome_with_object(): WelcomeBean {
        return WelcomeBean("Hello World")
    }

    @GetMapping("/rest/name/{name}")
    fun welcome_with_parameter(@PathVariable name: String): WelcomeBean {
        return WelcomeBean("Hello World $name")
    }
}