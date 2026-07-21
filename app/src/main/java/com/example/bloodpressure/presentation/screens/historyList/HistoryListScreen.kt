package com.example.bloodpressure.presentation.screens.historyList

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bloodpressure.ui.BPScreen
import com.example.bloodpressure.ui.HistoryItem

@Composable
fun HistoryListScreen(
    component: HistoryListComponent
) {
    BPScreen(
        modifier = Modifier,
        content = {
            val model = component.model.collectAsState()
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 24.dp)
                    .verticalScroll(rememberScrollState())
                ,
            ) {
                items(
                    items = model.value.historyList,
                    key = { it.id }
                ) {
                    HistoryItem(
                        modifier = Modifier.fillMaxWidth(),
                        bpItem = it
                    )
                }
            }
        }
    )
}