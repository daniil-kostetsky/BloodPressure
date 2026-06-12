package com.example.bloodpressure.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.bloodpressure.ui.theme.BPColors
import com.example.bloodpressure.ui.theme.BloodPressureTheme

@Composable
fun BPScreen(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit,
    contentAlign: Alignment = Alignment.Center
) {
    BloodPressureTheme {
        Scaffold(
            modifier =  modifier
                .background(brush = BPColors().verticalGradient)
                .fillMaxSize()
        ) { innerPadding ->
            Box(
                modifier = Modifier.padding(innerPadding),
                contentAlignment = contentAlign,
                content = content
            )
        }
    }
}