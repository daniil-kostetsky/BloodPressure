package com.example.bloodpressure.presentation.screens

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.bloodpressure.MainViewModel

@Composable
fun MainScreen(viewModel: MainViewModel) {

    Scaffold(
        bottomBar = {
            BottomNavigation
        }
    ) {

    }
}