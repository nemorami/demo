package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController {
    @Autowired
    val todoService = TodoService()

    @GetMapping("/users/{name}/todos")
    fun retrieveTodos(@PathVariable name: String): List<Todo> {
        return todoService.retrieveTodos(name)
    }
}