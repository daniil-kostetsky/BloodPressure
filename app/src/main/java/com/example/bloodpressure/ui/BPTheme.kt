package com.example.bloodpressure.ui

import android.graphics.Color
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import com.example.bloodpressure.ui.theme.BPColors

object BPTheme {
    val colors: BPColors
        @Composable @ReadOnlyComposable get() = LocalBPColors.current

    val typography: BPTypography
        @Composable get() = bpTypography


    val isDarkTheme: Boolean
        @Composable @ReadOnlyComposable get() = LocalIsDarkTheme.current

    val language: Languages
        @Composable @ReadOnlyComposable get() = LocalBPLanguage.current
}

val LocalBPLanguage: ProvidableCompositionLocal<Languages> =
    staticCompositionLocalOf { Languages.RU }

val LocalBPColors: ProvidableCompositionLocal<BPColors> =
    staticCompositionLocalOf { BPColors }


@Composable
fun BPTheme() {
    CompositionLocalProvider(
        LocalBPColors provides colors,
        LocalTextSelectionColors provides selectionColors,
        LocalBPLanguage provides language,
        content = content
    )
}