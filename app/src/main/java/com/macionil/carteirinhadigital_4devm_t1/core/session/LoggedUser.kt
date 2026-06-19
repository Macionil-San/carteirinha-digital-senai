package com.macionil.carteirinhadigital_4devm_t1.core.session

data class LoggedUser(
    val id: String,
    val nome: String,
    val descricao: String = "Aluno logado",
    val token: String
)
