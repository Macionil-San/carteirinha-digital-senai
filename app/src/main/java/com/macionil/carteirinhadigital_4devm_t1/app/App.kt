package com.macionil.carteirinhadigital_4devm_t1.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.macionil.carteirinhadigital_4devm_t1.core.designsystem.navigation.AppNavHost
import com.macionil.carteirinhadigital_4devm_t1.core.designsystem.theme.CarteirinhaDigitalTheme

@Composable
fun App() {
    CarteirinhaDigitalTheme() {
        val navController = rememberNavController()
        AppNavHost(
            navController = navController,
        )
    }
}