package com.example.bloodpressure.presentation.screens.addEditRecord

import com.arkivanov.mvikotlin.core.store.Store
import com.example.bloodpressure.BPStatus

interface AddEditRecordStore: Store<AddEditRecordStore.Intent,AddEditRecordStore.State, AddEditRecordStore.Label> {

    data class State(
        val id: Int,
        val sys: Int,
        val dia: Int,
        val pulse: Int,
        val date: String,
        val time: String,
        val note: String,
        val atmPressure: Int,
        val bpStatus: BPStatus,
    )

    sealed interface Label {
        data object OnSave : Label
    }

    sealed interface Intent {
        data class OnSysChange(val sys: Int) : Intent
        data class OnDiaChange(val dia: Int) : Intent
        data class OnPulseChange(val pulse: Int) : Intent
        data class OnDateChange(val date: String) : Intent
        data class OnTimeChange(val time: String) : Intent
        data class OnNoteChange(val note: String) : Intent
        data class OnAtmPressureChange(val pressure: Int) : Intent
        data object OnSave : Intent
    }

    companion object {
        fun initState(): State =
            State(
                id = 0,
                sys = 120,
                dia = 80,
                pulse = 60,
                date = "18 May, 2026",
                time = "22:04",
                note = "empty to do",
                atmPressure = 760,
                bpStatus = BPStatus.NORMAL
            )

    }
}