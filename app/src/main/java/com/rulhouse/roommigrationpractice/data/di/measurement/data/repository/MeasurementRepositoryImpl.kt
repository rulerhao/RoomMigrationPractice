package com.oucare.bbt_oucare.feature_node.measurement.data.repository

import com.oucare.bbt_oucare.feature_node.measurement.data.data_source.MeasurementDao
import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Measurement
import com.oucare.bbt_oucare.feature_node.measurement.domain.repository.MeasurementRepository
import kotlinx.coroutines.flow.Flow

class MeasurementRepositoryImpl (
    private val dao: MeasurementDao
) : MeasurementRepository {

    override fun getMeasurements(): Flow<List<Measurement>> {
        return dao.getMeasurements()
    }

    override fun getMeasurementsByUserId(userId: Int): Flow<List<Measurement>> {
        return dao.getMeasurementsByUserId(userId)
    }

    override suspend fun getMeasurementById(id: Int): Measurement? {
        return dao.getMeasurementById(id)
    }

    override suspend fun insertMeasurement(measurement: Measurement) {
        dao.insertMeasurement(measurement)
    }

    override suspend fun deleteMeasurement(measurement: Measurement) {
        dao.deleteMeasurement(measurement)
    }
}