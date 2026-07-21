package com.example.bloodpressure.presentation.screens.addEditRecord

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.mvikotlin.extensions.coroutines.labels
import com.arkivanov.mvikotlin.extensions.coroutines.stateFlow
import com.example.bloodpressure.presentation.core.componentScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DefaultAddEditRecordComponent(
    componentContext: ComponentContext,
    private val onSaved: () -> Unit
) : AddEditRecordComponent, ComponentContext by componentContext {


    private lateinit var store: AddEditRecordStore

    init {
        componentScope().launch {
            store.labels.collect {
                when (it) {
                    AddEditRecordStore.Label.OnSave -> onSaved()
                }
            }
        }
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    override val model: StateFlow<AddEditRecordStore.State>
        get() = store.stateFlow

    override fun onSysChange(sys: Int) {
        store.accept(AddEditRecordStore.Intent.OnSysChange(sys = sys))
    }

    override fun onDiaChange(dia: Int) {
        store.accept(AddEditRecordStore.Intent.OnDiaChange(dia = dia))

    }

    override fun onPulseChange(pulse: Int) {
        store.accept(AddEditRecordStore.Intent.OnPulseChange(pulse = pulse))

    }

    override fun onDateChange(date: String) {
        store.accept(AddEditRecordStore.Intent.OnDateChange(date = date))

    }

    override fun onTimeChange(time: String) {
        store.accept(AddEditRecordStore.Intent.OnTimeChange(time = time))

    }

    override fun onNoteChange(note: String) {
        store.accept(AddEditRecordStore.Intent.OnNoteChange(note = note))

    }

    override fun onAtmPressureChange(pressure: Int) {
        store.accept(AddEditRecordStore.Intent.OnAtmPressureChange(pressure = pressure))

    }

    override fun onSave() {
        store.accept(AddEditRecordStore.Intent.OnSave)
    }
}