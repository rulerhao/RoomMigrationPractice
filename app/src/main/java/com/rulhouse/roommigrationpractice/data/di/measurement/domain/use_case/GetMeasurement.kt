package com.oucare.bbt_oucare.feature_node.measurement.domain.use_case

import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Measurement
import com.oucare.bbt_oucare.feature_node.measurement.domain.repository.MeasurementRepository

class GetMeasurement(
    private val repository: MeasurementRepository
) {
    suspend operator fun invoke(id: Int): Measurement? {
        return repository.getMeasurementById(id)
    }
}