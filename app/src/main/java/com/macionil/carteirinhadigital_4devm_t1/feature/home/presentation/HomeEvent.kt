package com.macionil.carteirinhadigital_4devm_t1.feature.home.presentation

sealed interface HomeEvent {
    data object OnCarteirinhaClick : HomeEvent
    data object OnUnidadesCurricularesClick : HomeEvent
}