package com.example.bloodpressure.presentation.screens.historyList

import com.arkivanov.decompose.ComponentContext
import com.example.bloodpressure.domain.entity.BPItem
import kotlinx.coroutines.flow.StateFlow

class DefaultHistoryListComponent(
    componentContext: ComponentContext,
    onEditRecordRequest: (BPItem) -> Unit
) : HistoryListComponent, ComponentContext by componentContext{

    init {
        stateKeeper.register(KEY, HistoryListComponent.Model.serializer()) {
            model.value
        }
    }

//    private val _model = MutableStateFlow<HistoryListComponent.Model>(
//        historyList
//    )
    override val model: StateFlow<HistoryListComponent.Model>
        get() = TODO("Not yet implemented")

    override fun onEditRecord(record: BPItem) {
        onEditRecord(record)
    }

    companion object {
        private val KEY = "DefaultHistoryListComponent"
    }
}