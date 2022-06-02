package com.oucare.bbt_oucare.feature_node.measurement.domain.use_case


import com.oucare.bbt_oucare.feature_node.measurement.domain.model.InvalidMeasurementException
import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Measurement
import com.oucare.bbt_oucare.feature_node.measurement.domain.repository.MeasurementRepository

class AddMeasurement (
    private val repository: MeasurementRepository
) {
    @Throws(InvalidMeasurementException::class)
    suspend operator fun invoke(measurement: Measurement) {
        repository.insertMeasurement(measurement)
    }
}