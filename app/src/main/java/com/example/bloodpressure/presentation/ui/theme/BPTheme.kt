package com.example.bloodpressure.presentation.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import com.example.bloodpressure.domain.entity.Languages

object BPTheme {

    val colors: BPColors = BPColors

    val typography: BPTypography = BPTypography

    val language: Languages
        @Composable @ReadOnlyComposable get() = LocalBPLanguage.current
}

val LocalBPLanguage: ProvidableCompositionLocal<Languages> =
    staticCompositionLocalOf { Languages.RU }

@Composable
fun BPTheme(
    language: Languages,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalBPLanguage provides language,
        content = content
    )
}