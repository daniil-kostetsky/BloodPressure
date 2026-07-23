package com.example.bloodpressure.presentation.screens.charts

import com.arkivanov.decompose.ComponentContext
import com.example.bloodpressure.domain.entity.BPItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DefaultChartsComponent(
    componentContext: ComponentContext,
    private val onSaved: () -> Unit
) : AddEditRecordComponent, ComponentContext by componentContext {

    // val repo TODO
    // val useCases TODO


    private val _model = MutableStateFlow<BPItem>(
        BPItem.initState()
    )


    override val model: StateFlow<BPItem>
        get() = _model.asStateFlow()

    override fun onSysChange(sys: Int) {
        _model.value = model.value.copy(sys = sys)
    }

    override fun onDiaChange(dia: Int) {
        _model.value = model.value.copy(dia = dia)
    }

    override fun onPulseChange(pulse: Int) {
        _model.value = model.value.copy(pulse = pulse)
    }

    override fun onDateChange(date: String) {
        _model.value = model.value.copy(date = date)
    }

    override fun onTimeChange(time: String) {
        _model.value = model.value.copy(time = time)
    }

    override fun onNoteChange(note: String) {
        _model.value = model.value.copy(note = note)
    }

    override fun onAtmPressureChange(pulse: Int) {
        _model.value = model.value.copy(pulse = pulse)
    }

    override fun onSave() {
        onSaved()
        TODO("Not yet implemented")
    }

    override fun onClose() {
        TODO("Not yet implemented")
    }
}