package com.example.bloodpressure.presentation.editRecord

import com.example.bloodpressure.BPItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DefaultEditRecordComponent(
    private val bpItem: BPItem
) : EditRecordComponent {

    // val repo TODO
    // val useCases TODO

    private val _model = MutableStateFlow<BPItem>(
        bpItem
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
        bpItem.copy(
            // id except
        )
    }

    override fun onClose() {
        TODO("Not yet implemented")
    }
}