package com.example.bloodpressure.domain.usecase

import com.example.bloodpressure.domain.entity.BPItem
import com.example.bloodpressure.domain.repository.BPRepository
import javax.inject.Inject

class AddEditRecord @Inject constructor(
    private val repository: BPRepository
) {
    suspend operator fun invoke(bpItem: BPItem) = repository.addEditRecord(bpItem)
}