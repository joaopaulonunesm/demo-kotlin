package com.example.kotlin.demo.service

import com.example.kotlin.demo.entity.Cliente
import com.example.kotlin.demo.repository.ClienteRepository
import com.sun.corba.se.impl.ior.ObjectReferenceFactoryImpl
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class ClienteService(
        private val repository: ClienteRepository
) {

    fun criar(cliente : Cliente) = repository.save(cliente)

    fun alterar (id : Long, cliente : Cliente) : Cliente {
        var clienteAlterado = buscarPorId(id)

        cliente.apply {
            clienteAlterado.nome = cliente.nome;
            clienteAlterado.cpf = cliente.cpf;
        }

        return repository.save(clienteAlterado)
    }

    fun delete(id:Long) {
        buscarPorId(id)
        repository.deleteById(id)
    }

    fun buscarTodos() = repository.findAll()

    fun buscarPorId(id:Long) = repository.findById(id).orElseThrow { RuntimeException("Cliente não encontrado. ID: $id") }

}