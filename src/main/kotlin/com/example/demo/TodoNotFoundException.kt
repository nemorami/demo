package com.example.demo

import java.lang.RuntimeException

class TodoNotFoundException(msg: String): RuntimeException(msg) {

}