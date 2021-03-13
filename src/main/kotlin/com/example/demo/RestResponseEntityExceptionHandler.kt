package com.example.demo

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
@RestController
class RestResponseEntityExceptionHandler : ResponseEntityExceptionHandler() {

}