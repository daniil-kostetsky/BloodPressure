package com.example.bloodpressure.presentation.screens.home

import com.example.bloodpressure.BPItem
import kotlinx.coroutines.flow.StateFlow

interface HomeComponent { // TODO maybe join add and edit, only change null or not null paraeter

    val model: StateFlow<BPItem>

    fun onSysChange(sys: Int)
    fun onDiaChange(dia: Int)
    fun onPulseChange(pulse: Int)
    fun onDateChange(date: String)
    fun onTimeChange(time: String)
    fun onNoteChange(note: String)
    fun onAtmPressureChange(pulse: Int)

    fun onSave()
}