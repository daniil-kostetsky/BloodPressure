package com.example.bloodpressure.presentation.historyList

import com.example.bloodpressure.BPItem
import kotlinx.coroutines.flow.StateFlow
import kotlinx.serialization.Serializable

interface HistoryListComponent {

    val model: StateFlow<Model>

    fun onEditRecord(record: BPItem)

    @Serializable
    data class Model(
        val historyList: List<BPItem>
    )
}