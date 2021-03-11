package com.example.kotlin.demo.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Cliente (
        @Id
        var id: Long,
        var nome: String,
        var cpf: String
)