package com.example.demo

import javax.persistence.*

@Entity
class User(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val userid: String,
        val name: String,
        @OneToMany(mappedBy = "user")
        val todos: List<Todo>
)