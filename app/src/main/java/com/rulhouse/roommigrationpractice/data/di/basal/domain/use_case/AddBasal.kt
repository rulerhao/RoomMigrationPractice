package com.oucare.bbt_oucare.feature_node.basal.domain.use_case


import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Basal
import com.oucare.bbt_oucare.feature_node.measurement.domain.model.InvalidMeasurementException
import com.oucare.bbt_oucare.feature_node.measurement.domain.repository.BasalRepository

class AddBasal (
    private val repository: BasalRepository
) {
    @Throws(InvalidMeasurementException::class)
    suspend operator fun invoke(basal: Basal): Long {
        return repository.insertBasal(basal)
    }
}