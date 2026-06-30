package com.example.bloodpressure.presentation.addRecord

import com.example.bloodpressure.BPItem
import kotlinx.coroutines.flow.StateFlow

interface AddRecordComponent {

    val model: StateFlow<BPItem>

    fun onSysChange(sys: Int)
    fun onDiaChange(dia: Int)
    fun onPulseChange(pulse: Int)
    fun onDateChange(date: String)
    fun onTimeChange(time: String)
    fun onNoteChange(note: String)
    fun onAtmPressureChange(pulse: Int)

    fun onSave()
    fun onClose()
}