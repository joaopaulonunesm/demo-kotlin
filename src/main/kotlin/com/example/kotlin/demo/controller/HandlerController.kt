package com.example.kotlin.demo.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.lang.RuntimeException

@ControllerAdvice
class HandlerController {

    @ExceptionHandler(RuntimeException::class)
    fun runtimeExceptionHanlder(ex:RuntimeException) : ResponseEntity<String> {
        return ResponseEntity.badRequest().body(ex.message)
    }

}