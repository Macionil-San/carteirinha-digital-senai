package com.rafaelcosta.carteirinhadigital_4devm_t1.feature.carteirinha.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CarteirinhaScreen(
    modifier: Modifier = Modifier
) {
    CarteirinhaContent(
        qrCodeContent = "seunumerodematriculaaqui",
        modifier = modifier
    )
}