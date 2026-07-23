package com.example.bloodpressure.domain.usecase

import com.example.bloodpressure.domain.repository.BPRepository
import javax.inject.Inject

class GetHistoryList @Inject constructor(
    private val repository: BPRepository
) {
    suspend operator fun invoke() = repository.historyList()
}