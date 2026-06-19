package com.macionil.carteirinhadigital_4devm_t1.feature.auth.presentation

sealed interface LoginEvent {
    data class OnLoginChange(val value: String) : LoginEvent
    data class OnSenhaChange(val value: String) : LoginEvent
    data object OnEntrarClick : LoginEvent
    data object OnNavegacaoRealizada : LoginEvent
}