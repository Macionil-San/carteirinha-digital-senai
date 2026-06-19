package com.macionil.carteirinhadigital_4devm_t1.feature.unidadecurricular.presentation

import com.macionil.carteirinhadigital_4devm_t1.feature.unidadecurricular.domain.model.UnidadeCurricular

data class UnidadeCurricularUiState(
    val isLoading: Boolean = false,
    val unidadesCurriculares: List<UnidadeCurricular> = emptyList(),
    val errorMessage: String? = null
)