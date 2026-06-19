package com.macionil.carteirinhadigital_4devm_t1.feature.carteirinha.data.repository

import com.macionil.carteirinhadigital_4devm_t1.feature.carteirinha.domain.model.Carteirinha
import kotlinx.coroutines.delay

class FakeCarteirinhaRepository : CarteirinhaRepository {
    override suspend fun buscarCarteirinha(): Result<Carteirinha> {
        delay(1500)

        return Result.success(
            Carteirinha(
                nome = "Ruan Santos",
                curso = "Técnico em Desenvolvimento de Sistemas",
                turma = "4DEVM-T4",
                matricula = "20260001",
                unidade = "SENAI Anchieta",
                status = "Ativo",
                qrCodeContent = "MATRICULA:20260001;ALUNO:Ruan Santos;TURMA:4DEVM-T1"
            )
        )
    }
}
