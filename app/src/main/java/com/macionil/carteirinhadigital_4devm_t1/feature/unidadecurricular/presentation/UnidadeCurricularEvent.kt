package com.macionil.carteirinhadigital_4devm_t1.feature.unidadecurricular.presentation

sealed interface UnidadeCurricularEvent {
    data object OnCarregarDados : UnidadeCurricularEvent
    data object OnTentarNovamenteClick : UnidadeCurricularEvent
    data object OnVoltarClick : UnidadeCurricularEvent
}