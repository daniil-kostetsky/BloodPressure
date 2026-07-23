package com.example.bloodpressure.domain.repository

import com.example.bloodpressure.domain.entity.BPItem

interface BPRepository {

    suspend fun historyList(): List<BPItem>
    suspend fun addEditRecord(record: BPItem)
    suspend fun deleteRecord(record: BPItem)
}