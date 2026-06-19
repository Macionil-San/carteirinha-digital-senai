package com.macionil.carteirinhadigital_4devm_t1.core.designsystem.component

import androidx.compose.ui.graphics.vector.ImageVector


data class AppDrawerItem(
    val label: String,
    val icon: ImageVector,
    val selected: Boolean = false,
    val onClick: () -> Unit
)
