package com.example.bloodpressure.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.bloodpressure.domain.entity.Languages
import com.example.bloodpressure.ui.theme.BPTheme

@Preview
@Composable
fun BPScreen(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit = {},
    contentAlign: Alignment = Alignment.Center
) {
    BPTheme(
        language = Languages.RU
    ) {
        Scaffold(
            modifier = modifier
                .fillMaxSize(),
            containerColor = Color.Transparent


        ) { innerPadding ->
            Box(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colorStops = arrayOf(
                                0.0f to BPTheme.colors.surfaceBg0,
                                0.2f to BPTheme.colors.surfaceBg20,
                                0.4f to BPTheme.colors.surfaceBg40,
                                1.0f to BPTheme.colors.surfaceBg100
                            )
                        )
                    )
                ,
                contentAlignment = contentAlign,
                content = content
            )
        }
    }
}