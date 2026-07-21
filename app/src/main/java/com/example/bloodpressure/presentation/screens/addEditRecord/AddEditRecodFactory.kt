package com.example.bloodpressure.presentation.screens.addEditRecord

import com.arkivanov.mvikotlin.core.store.Reducer
import com.arkivanov.mvikotlin.core.store.Store
import com.arkivanov.mvikotlin.core.store.StoreFactory
import com.arkivanov.mvikotlin.extensions.coroutines.CoroutineExecutor

class AddEditRecordFactory(
    private val storeFactory: StoreFactory
) {

    fun create(): AddEditRecordStore = object : AddEditRecordStore,
        Store<AddEditRecordStore.Intent, AddEditRecordStore.State, AddEditRecordStore.Label>
        by storeFactory.create(
            name = "AddEditRecordStore",
            initialState = AddEditRecordStore.initState(),
            reducer = ReducerImpl,
            executorFactory = ::ExecutorImpl
        ) {}

    private sealed interface Action // c repo
    private sealed interface Msg { // Intent & Action
        data class OnSysChange(val sys: Int) : Msg
        data class OnDiaChange(val dia: Int) : Msg
        data class OnPulseChange(val pulse: Int) : Msg
        data class OnDateChange(val date: String) : Msg
        data class OnTimeChange(val time: String) : Msg
        data class OnNoteChange(val note: String) : Msg
        data class OnAtmPressureChange(val pressure: Int) : Msg

    }

    private class ExecutorImpl : CoroutineExecutor<
            AddEditRecordStore.Intent,
            Action,
            AddEditRecordStore.State,
            Msg,
            AddEditRecordStore.Label>() {

        override fun executeIntent(intent: AddEditRecordStore.Intent) {
            when (intent) {
                is AddEditRecordStore.Intent.OnAtmPressureChange -> dispatch(
                    Msg.OnAtmPressureChange(
                        intent.pressure
                    )
                )

                is AddEditRecordStore.Intent.OnDateChange -> dispatch(Msg.OnDateChange(intent.date))
                is AddEditRecordStore.Intent.OnDiaChange -> dispatch(Msg.OnDiaChange(intent.dia))
                is AddEditRecordStore.Intent.OnNoteChange -> dispatch(Msg.OnNoteChange(intent.note))
                is AddEditRecordStore.Intent.OnPulseChange -> dispatch(Msg.OnPulseChange(intent.pulse))
                AddEditRecordStore.Intent.OnSave -> {
                    TODO()
                    val currentState = state()
                    //use case repo
                    publish(AddEditRecordStore.Label.OnSave)
                }

                is AddEditRecordStore.Intent.OnSysChange -> dispatch(Msg.OnSysChange(intent.sys))
                is AddEditRecordStore.Intent.OnTimeChange -> dispatch(Msg.OnTimeChange(intent.time))
            }
            state()
        }
    }

    private object ReducerImpl : Reducer<AddEditRecordStore.State, Msg> {
        override fun AddEditRecordStore.State.reduce(
            msg: Msg
        ): AddEditRecordStore.State {
            return when (msg) {
                is Msg.OnAtmPressureChange -> copy(atmPressure = msg.pressure)
                is Msg.OnDateChange -> copy(date = msg.date)
                is Msg.OnDiaChange -> copy(dia = msg.dia)
                is Msg.OnNoteChange -> copy(note = msg.note)
                is Msg.OnPulseChange -> copy(pulse = msg.pulse)
                is Msg.OnSysChange -> copy(sys = msg.sys)
                is Msg.OnTimeChange -> copy(time = msg.time)
            }
        }
    }
}