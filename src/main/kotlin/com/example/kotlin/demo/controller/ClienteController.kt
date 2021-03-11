package com.example.kotlin.demo.controller

import com.example.kotlin.demo.entity.Cliente
import com.example.kotlin.demo.service.ClienteService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/clientes")
class ClienteController(private var clienteService: ClienteService) {

    @PostMapping
    fun criar(@RequestBody cliente : Cliente) = clienteService.criar(cliente)

    @PutMapping("/{id}")
    fun alterar(@PathVariable id : Long, @RequestBody cliente : Cliente) = clienteService.alterar(id, cliente)

    @GetMapping
    fun buscarTodos() = clienteService.buscarTodos()

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id : Long) = clienteService.buscarPorId(id)

    @DeleteMapping("/{id}")
    fun deletaPorId(@PathVariable id : Long) = clienteService.delete(id)

}