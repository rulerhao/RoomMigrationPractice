package com.oucare.bbt_oucare.feature_node.measurement.domain.use_case

data class MeasurementUseCases (
    val getMeasurements: GetMeasurements,
    val getMeasurementsByUserId: GetMeasurementsByUserId,
    val deleteMeasurement: DeleteMeasurement,
    val addMeasurement: AddMeasurement,
    val getMeasurement: GetMeasurement
)
