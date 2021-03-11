package com.example.kotlin.demo.repository

import com.example.kotlin.demo.entity.Cliente
import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository : JpaRepository<Cliente, Long> {

}