package com.rafaelcosta.carteirinhadigital_4devm_t1.app

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.rafaelcosta.carteirinhadigital_4devm_t1.core.designsystem.navigation.AppNavHost
import com.rafaelcosta.carteirinhadigital_4devm_t1.core.designsystem.theme.CarteirinhaDigital_4DEVM_T1Theme

@Composable
fun App() {
    CarteirinhaDigital_4DEVM_T1Theme() {
        val navController = rememberNavController()
        AppNavHost(
            navController = navController,
        )
    }
}