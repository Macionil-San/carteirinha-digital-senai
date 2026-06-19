package com.macionil.carteirinhadigital_4devm_t1.feature.carteirinha.presentation

import com.macionil.carteirinhadigital_4devm_t1.feature.carteirinha.domain.model.Carteirinha

data class CarteirinhaUiState(
    val isLoading: Boolean = false,
    val carteirinha: Carteirinha? = null,
    val errorMessage: String? = null
)