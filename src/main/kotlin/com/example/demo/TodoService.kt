package com.example.demo

import org.springframework.stereotype.Service

//
//import org.springframework.stereotype.Service
//import java.util.*
//
//@Service
//class TodoService {
//    companion object {
//        val todos = mutableListOf<Todo>(Todo(1, "Jack", "Learn Spring MVC", Date(), false),
//                Todo(2, "Jack", "Learn Struts", Date(), false),
//                Todo(3, "Jill", "Learn Hibernate", Date(), false))
//        val todoCount = 3
//    }
//
//    fun retrieveTodos(user: String): List<Todo> {
//        val filteredTodos = mutableListOf<Todo>()
//
//        for (todo in todos) {
//            if(todo.user == user)
//                filteredTodos.add(todo)
//        }
//        return filteredTodos
//    }
//
//    fun addTodo(name: String, desc: String, targetDate: Date, isDone: Boolean): Todo {
//        val todo = Todo(todoCount, name, desc, targetDate, isDone)
//        todos.add(todo)
//        return todo
//    }
//
//    fun retrieveTodo(id: Int): Todo?{
//        for(todo in todos) {
//            if(todo.id == id)
//                return todo
//        }
//        return null
//    }
//
//}