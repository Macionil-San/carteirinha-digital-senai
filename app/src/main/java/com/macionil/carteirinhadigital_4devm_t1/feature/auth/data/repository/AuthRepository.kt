package com.macionil.carteirinhadigital_4devm_t1.feature.auth.data.repository

import com.macionil.carteirinhadigital_4devm_t1.feature.auth.domain.model.UsuarioLogado

interface AuthRepository {
    suspend fun login(login: String, senha: String): Result<UsuarioLogado>
}
