package com.macionil.carteirinha.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.macionil.carteirinha.core.designsystem.navigation.AppNavHost
import com.macionil.carteirinha.core.designsystem.theme.CarteirinhaDigital_4DEVM_T1Theme

@Composable
fun App() {
    CarteirinhaDigital_4DEVM_T1Theme() {
        val navController = rememberNavController()
        AppNavHost(
            navController = navController,
        )
    }
}