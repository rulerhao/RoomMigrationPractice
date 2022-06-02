package com.oucare.bbt_oucare.feature_node.measurement.domain.use_case

import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Measurement
import com.oucare.bbt_oucare.feature_node.measurement.domain.repository.MeasurementRepository

class DeleteMeasurement (
    private val repository: MeasurementRepository
) {
    suspend operator fun invoke(measurement: Measurement) {
        repository.deleteMeasurement(measurement)
    }
}