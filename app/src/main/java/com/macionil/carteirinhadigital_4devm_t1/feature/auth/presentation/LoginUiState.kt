package com.macionil.carteirinhadigital_4devm_t1.feature.auth.presentation

import com.macionil.carteirinhadigital_4devm_t1.feature.auth.domain.model.UsuarioLogado

data class LoginUiState(
    val login: String = "",
    val senha: String = "",
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
    val usuarioLogado: UsuarioLogado? = null
) {
    val loginRealizado: Boolean
        get() = usuarioLogado != null
}