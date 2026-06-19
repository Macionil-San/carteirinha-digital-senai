package com.macionil.carteirinhadigital_4devm_t1.feature.auth.domain.model

data class UsuarioLogado(
    val id: String,
    val nome: String,
    val token: String
)
