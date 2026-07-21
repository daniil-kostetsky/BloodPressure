package com.example.bloodpressure.presentation.screens.historyList

import com.arkivanov.mvikotlin.core.store.Reducer
import com.arkivanov.mvikotlin.core.store.Store
import com.arkivanov.mvikotlin.core.store.StoreFactory
import com.arkivanov.mvikotlin.extensions.coroutines.CoroutineBootstrapper
import com.arkivanov.mvikotlin.extensions.coroutines.CoroutineExecutor
import com.example.bloodpressure.BPItem
import com.example.bloodpressure.presentation.historyList.HistoryListStore.Intent
import kotlinx.coroutines.launch

class HistoryListStoreFactory(
    private val storeFactory: StoreFactory,
//    private val getHistoryListUseCase: HistoryListUseCase
) {

    fun create(): HistoryListStore = object : HistoryListStore,
        Store<HistoryListStore.Intent, HistoryListStore.State, HistoryListStore.Label>
        by storeFactory.create(
            name = "HistoryListStore",
            initialState = HistoryListStore.State(emptyList()),
            reducer = ReducerImpl,
            executorFactory = ::ExecutorImpl,
            bootstrapper = BootstrapperImpl()
        ) {}

    private sealed interface Action {
        // c repo
        data class HistoryLoaded(val history: List<BPItem>) : Action
    }

    private sealed interface Msg { // change screenState
        data object BPItemClicked : Msg

        data class HistoryLoaded(val history: List<BPItem>) : Msg

    }

    private inner class BootstrapperImpl : CoroutineBootstrapper<Action>() {
        override fun invoke() {
            scope.launch {
                // usecase collect dispatch Action
            }
        }
    }

    private inner class ExecutorImpl: CoroutineExecutor< // action, intent
            HistoryListStore.Intent,
            Action,

            HistoryListStore.State,
            Msg,
            HistoryListStore.Label
            >() {
        override fun executeAction(action: Action) {
            when (action) {
                is Action.HistoryLoaded -> dispatch(Msg.HistoryLoaded(action.history))
            }
        }

        override fun executeIntent(intent: Intent) {
            when (intent) {
                is HistoryListStore.Intent.BPItemClicked -> publish(HistoryListStore.Label.BPItemClicked)
            }
        }
    }
    private object ReducerImpl : Reducer<HistoryListStore.State, Msg> { // handle Msg
        override fun HistoryListStore.State.reduce(
            msg: Msg
        ): HistoryListStore.State {
            return when (msg) {
                is Msg.BPItemClicked -> TODO()
                is Msg.HistoryLoaded -> copy(historyList = msg.history)
            }
        }
    }
}