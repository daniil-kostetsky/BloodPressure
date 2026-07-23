package com.example.bloodpressure.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class BPItem(
    val id: Int, // TODO in Room
    val sys: Int,
    val dia: Int,
    val pulse: Int,
    val date: String, // TODO
    val time: String,
    val note: String,
    val atmPressure: Int,
    val bpStatus: BPStatus,
)