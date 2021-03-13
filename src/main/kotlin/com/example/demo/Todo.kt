package com.example.demo

import java.util.*
import javax.persistence.*

/*
data class Todo(val id: Int,
                val user: String,
                val desc: String,
                val targetDate: Date,
                val isDone: Boolean)

 */
@Entity
class Todo(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        //TODO: var, val 확인
        var id: Long,
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name = "userid")
        var user: User,
        var title: String,
        var description: String,
        var targetDate: Date,
        var isDone: Boolean
)