package com.oucare.bbt_oucare.feature_node.measurement.domain.repository

import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Measurement
import kotlinx.coroutines.flow.Flow

interface MeasurementRepository {
    fun getMeasurements(): Flow<List<Measurement>>

    fun getMeasurementsByUserId(userId: Int): Flow<List<Measurement>>

    suspend fun getMeasurementById(id: Int): Measurement?

    suspend fun insertMeasurement(measurement: Measurement)

    suspend fun deleteMeasurement(measurement: Measurement)
}