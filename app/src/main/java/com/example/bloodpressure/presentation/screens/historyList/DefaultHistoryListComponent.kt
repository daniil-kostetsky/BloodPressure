package com.example.bloodpressure.presentation.screens.historyList

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ComponentContextFactory
import com.arkivanov.essenty.backhandler.BackHandler
import com.arkivanov.essenty.instancekeeper.InstanceKeeper
import com.arkivanov.essenty.lifecycle.Lifecycle
import com.arkivanov.essenty.statekeeper.StateKeeper
import com.example.bloodpressure.BPItem
import com.example.bloodpressure.ui.theme.BPTheme
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.serialization.SerializationStrategy

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