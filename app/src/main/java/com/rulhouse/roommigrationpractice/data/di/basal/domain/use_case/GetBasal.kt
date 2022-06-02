package com.oucare.bbt_oucare.feature_node.measurement.domain.use_case

import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Basal
import com.oucare.bbt_oucare.feature_node.measurement.domain.repository.BasalRepository

class GetBasal(
    private val repository: BasalRepository
) {
    suspend operator fun invoke(id: Int): Basal? {
        return repository.getBasalById(id)
    }
}