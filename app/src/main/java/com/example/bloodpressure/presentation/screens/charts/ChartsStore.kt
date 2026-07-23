package com.example.bloodpressure.presentation.screens.charts

import com.example.bloodpressure.domain.entity.BPStatus

interface ChartsStore {

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

    sealed interface Intent {
        data class OnSysChange(val sys: Int) :
            com.example.bloodpressure.presentation.charts.AddEditRecordStore.Intent
        data class OnDiaChange(val dia: Int) :
            com.example.bloodpressure.presentation.charts.AddEditRecordStore.Intent
        data class OnPulseChange(val pulse: Int) :
            com.example.bloodpressure.presentation.charts.AddEditRecordStore.Intent
        data class OnDateChange(val date: String) :
            com.example.bloodpressure.presentation.charts.AddEditRecordStore.Intent
        data class OnTimeChange(val time: String) :
            com.example.bloodpressure.presentation.charts.AddEditRecordStore.Intent
        data class OnNoteChange(val note: String) :
            com.example.bloodpressure.presentation.charts.AddEditRecordStore.Intent
        data class OnAtmPressureChange(val pulse: Int) :
            com.example.bloodpressure.presentation.charts.AddEditRecordStore.Intent
        data object OnSave : com.example.bloodpressure.presentation.charts.AddEditRecordStore.Intent
    }
}