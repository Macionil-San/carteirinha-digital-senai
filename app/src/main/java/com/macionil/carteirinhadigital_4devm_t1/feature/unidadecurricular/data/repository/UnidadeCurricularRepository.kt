package com.macionil.carteirinhadigital_4devm_t1.feature.unidadecurricular.data.repository

import com.macionil.carteirinhadigital_4devm_t1.feature.unidadecurricular.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun buscarUnidadesCurriculares(): Result<List<UnidadeCurricular>>
}
