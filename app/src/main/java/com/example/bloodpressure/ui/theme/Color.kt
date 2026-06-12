package com.example.bloodpressure.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

data object BPColors {
    val surfaceLightGreen: Color = Color(0xFFF0FDF4)
    val surfaceDarkGreen: Color = Color(0xFFD0FAE5)

    val bgPrimary: Color = Color(0xFFECFDF5)
    val bgSecondary: Color = Color(0xFFF9FAFB)
    val bgBlue: Color = Color(0xFFEFF6FF)
    val bg: Color = Color(0xFFF9FAFB)

    val iconRedHeart: Color = Color(0xFFFF2056)

    val textPrimary: Color = Color(0xFF101828)
    val textPrimaryLight: Color = Color(0xFF364153)
    val textSecondary: Color = Color(0xFF007A55)
    val textSecondaryGrey: Color = Color(0xFF6A7282)

    val strokeOrange: Color = Color(0xFFFFB86A)

//    val cardBgPeach: Color

    val secondaryBlack: Color = Color(0xFF162456)
    // Градиент с остановками
    val verticalGradient = Brush.verticalGradient(
        colorStops = arrayOf(
            0.0f to surfaceLightGreen,   // в самом верху
            0.2f to surfaceDarkGreen,    // на 20% высоты уже тёмный
            1.0f to surfaceDarkGreen     // и до низа остаётся тёмным
        )
    )
}