package com.example.bloodpressure.presentation.screens.historyList

import com.example.bloodpressure.BPItem

interface HistoryListStore {

    data class State(
        val historyList: List<BPItem>
    )

    sealed interface Label { // one-time action, NO change  screenState
        data object BPItemClicked : Label
    }

    sealed interface Intent {
        data object BPItemClicked : Intent

    }
}