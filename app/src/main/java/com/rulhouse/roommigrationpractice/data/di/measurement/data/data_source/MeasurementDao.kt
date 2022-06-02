package com.oucare.bbt_oucare.feature_node.measurement.data.data_source

import androidx.room.*
import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Measurement
import kotlinx.coroutines.flow.Flow

@Dao
interface MeasurementDao {

    @Query("SELECT * FROM measurement")
    fun getMeasurements(): Flow<List<Measurement>>

    @Query("SELECT * FROM measurement WHERE userId = :userId")
    fun getMeasurementsByUserId(userId: Int): Flow<List<Measurement>>

    @Query("SELECT * FROM measurement WHERE id = :id")
    suspend fun getMeasurementById(id: Int) : Measurement?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMeasurement(note: Measurement)

    @Delete
    suspend fun deleteMeasurement(note: Measurement)
}