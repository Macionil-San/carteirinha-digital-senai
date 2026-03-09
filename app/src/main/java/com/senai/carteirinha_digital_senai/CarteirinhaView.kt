package com.senai.carteirinha_digital_senai

import androidx.compose.animation.core.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.*
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rafaelcosta.myapplication.QrCode

@Composable
fun CarteirinhaView(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(R.drawable.background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        0.0f to Color(0xFF0A0A1A).copy(alpha = 0.55f),
                        0.4f to Color(0xFF0D1B3E).copy(alpha = 0.70f),
                        1.0f to Color(0xFF000510).copy(alpha = 0.92f)
                    )
                )
        )


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(
                    Brush.radialGradient(
                        colors = listOf(
                            Color(0xFF3A7BD5).copy(alpha = 0.25f),
                            Color.Transparent
                        ),
                        center = Offset(0.5f, 0f),
                        radius = 600f
                    )
                )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .padding(horizontal = 28.dp, vertical = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {


            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.senai_logo_1),
                    contentDescription = "logo_senai",
                    modifier = Modifier
                        .height(56.dp)
                        .wrapContentWidth(),
                    contentScale = ContentScale.Fit
                )
                Spacer(Modifier.height(8.dp))
                Text(
                    text = "CARTEIRINHA ESTUDANTIL",
                    color = Color.White.copy(alpha = 0.5f),
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 4.sp
                )
            }

            // ── FOTO DE PERFIL ──
            Box(contentAlignment = Alignment.Center) {
                // Anel externo brilhante animado
                val infiniteTransition = rememberInfiniteTransition(label = "ring")
                val angle by infiniteTransition.animateFloat(
                    initialValue = 0f,
                    targetValue = 360f,
                    animationSpec = infiniteRepeatable(
                        animation = tween(4000, easing = LinearEasing)
                    ),
                    label = "angle"
                )
                Box(
                    modifier = Modifier
                        .size(176.dp)
                        .clip(CircleShape)
                        .background(
                            Brush.sweepGradient(
                                colors = listOf(
                                    Color(0xFF3A7BD5),
                                    Color(0xFF00D2FF),
                                    Color(0xFF3A7BD5).copy(alpha = 0.2f),
                                    Color(0xFF3A7BD5)
                                )
                            )
                        )
                )
                // Espaçador branco
                Box(
                    modifier = Modifier
                        .size(170.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF050D1F))
                )

                Image(
                    painter = painterResource(R.drawable.profile),
                    contentDescription = "foto_perfil",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(162.dp)
                        .clip(CircleShape)
                )
            }


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(24.dp))
                    .background(
                        Brush.linearGradient(
                            colors = listOf(
                                Color.White.copy(alpha = 0.13f),
                                Color.White.copy(alpha = 0.05f)
                            )
                        )
                    )
                    .border(
                        width = 1.dp,
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color.White.copy(alpha = 0.35f),
                                Color.White.copy(alpha = 0.05f)
                            )
                        ),
                        shape = RoundedCornerShape(24.dp)
                    )
                    .padding(24.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    InfoRow(label = "NOME", value = "Ruan Macionil")
                    Divider(color = Color.White.copy(alpha = 0.1f), thickness = 1.dp)
                    InfoRow(label = "CURSO", value = "DEV-MA-4")
                }
            }

            // ── QR CODE ──
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(15.dp))
                    .background(
                        Brush.linearGradient(
                            colors = listOf(
                                Color.White.copy(alpha = 0.13f),
                                Color.White.copy(alpha = 0.05f)
                            )
                        )
                    )
                    .padding(5.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    QrCode(
                        conteudo = "90000000001417360196",
                        modifier = Modifier
                            .fillMaxWidth(0.55f)
                            .aspectRatio(1f)
                    )
                    Spacer(Modifier.height(6.dp))
                    Text(
                        text = "900 000 000 014 • 17360196",
                        fontSize = 10.sp,
                        color = Color(0xFF555555),
                        letterSpacing = 1.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

@Composable
private fun InfoRow(label: String, value: String) {
    Column {
        Text(
            text = label,
            color = Color(0xFF5A9BF5),
            fontSize = 9.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 2.sp
        )
        Spacer(Modifier.height(3.dp))
        Text(
            text = value,
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}