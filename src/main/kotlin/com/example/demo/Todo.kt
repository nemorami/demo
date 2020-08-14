package com.example.demo

import java.util.*

data class Todo(val id: Int,
                val user: String,
                val desc: String,
                val targetDate: Date,
                val isDone: Boolean)