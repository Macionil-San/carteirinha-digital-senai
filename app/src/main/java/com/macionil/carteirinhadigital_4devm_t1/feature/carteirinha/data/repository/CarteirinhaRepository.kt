package com.macionil.carteirinhadigital_4devm_t1.feature.carteirinha.data.repository

import com.macionil.carteirinhadigital_4devm_t1.feature.carteirinha.domain.model.Carteirinha

interface CarteirinhaRepository {
    suspend fun buscarCarteirinha(): Result<Carteirinha>
}
