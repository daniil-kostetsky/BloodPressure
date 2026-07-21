package com.example.bloodpressure.presentation.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.bloodpressure.R


private val inter = FontFamily(
    Font(R.font.inter)
)

data object BPTypography {
    val black60: TextStyle = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Black,
        fontSize = 60.sp,
        lineHeight = 60.sp,
        letterSpacing = -(2.74).sp
    )
    val black30: TextStyle = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Black,
        fontSize = 30.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.4.sp
    )

    val extraBold48 = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 48.sp,
        lineHeight = 48.sp,
        letterSpacing = 0.35.sp
    )
    val extraBold30 = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 30.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.4.sp
    )
    val bold36 = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.4.sp
    )
    val bold30 = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.4.sp
    )
    val bold24 = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 28.sp,
        letterSpacing = -(0.45).sp
    )
    val bold20 = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 28.sp,
        letterSpacing = -(0.45).sp
    )
    val bold12 = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.6.sp
    )
    val bold14 = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = -(0.15).sp
    )
    val medium18 = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        lineHeight = 28.sp,
        letterSpacing = -(0.45).sp
    )
    val medium14 = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.2.sp
    )
    val regular14 = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = -(0.15).sp
    )
    val regular18 = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        lineHeight = 28.sp,
        letterSpacing = -(0.44).sp
    )
    val normal12 = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.6.sp
    )
    val regularItalic16 = TextStyle(
        fontStyle = FontStyle.Italic,
        fontFamily = inter,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = -(0.3).sp
    )
}