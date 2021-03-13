package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import java.lang.RuntimeException

//
//@RestController
//class TodoController {
//    @Autowired
//    val todoService = TodoService()
//
//    @GetMapping("/users/{name}/todos")
//    fun retrieveTodos(@PathVariable name: String): List<Todo> {
//        return todoService.retrieveTodos(name)
//    }
//
//    @GetMapping("/users/{name}/todos/{id}")
//    fun retrieveTodo(@PathVariable name: String, @PathVariable id: Int): Todo?{
//        val todo = todoService.retrieveTodo(id)
//        when(todo) {
//            null -> throw TodoNotFoundException("Todo Not Found")
//            else -> return todo
//        }
//
//    }
//
//    @PostMapping("/users/{name}/todos")
//    fun addTodo(@PathVariable name: String, @Validated @RequestBody todo: Todo) : ResponseEntity<Any>{
//        val createTodo = todoService.addTodo(name, todo.description, todo.targetDate, todo.isDone)
//
//        val location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}").buildAndExpand(createTodo.id).toUri()
//        return ResponseEntity.created(location).build()
//
//    }
//
//    @GetMapping("/users/dummy-ser")
//    fun errorService(): Todo {
//        throw RuntimeException("Some Exception Occured")
//    }
//}