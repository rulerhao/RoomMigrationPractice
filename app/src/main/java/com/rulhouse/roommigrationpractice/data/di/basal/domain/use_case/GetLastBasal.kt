package com.oucare.bbt_oucare.feature_node.basal.domain.use_case

import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Basal
import com.oucare.bbt_oucare.feature_node.measurement.domain.repository.BasalRepository

class GetLastBasal(
    private val repository: BasalRepository
) {
    suspend operator fun invoke(): Basal? {
        return repository.getLastBasal()
    }
}