package com.example.demo

import java.util.*

data class ExceptionResponse(val message:String,
                             val details: String,
                             val timestamp: Date = Date() )