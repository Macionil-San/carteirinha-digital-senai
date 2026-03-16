package com.rafaelcosta.carteirinhadigital_4devm_t1.feature.auth.presentation.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.rafaelcosta.carteirinhadigital_4devm_t1.core.designsystem.navigation.Routes
import com.rafaelcosta.carteirinhadigital_4devm_t1.core.designsystem.theme.CarteirinhaDigital_4DEVM_T1Theme

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    var login by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    LoginContent(
        login = login,
        senha = senha,
        onLoginChange = { it },
        onSenhaChange = { it },
        onLoginClick = {
            navController.navigate(
                Routes.Carteirinha.route
            )
        },
        modifier = modifier
    )
}

