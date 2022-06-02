package com.oucare.bbt_oucare.feature_node.measurement.data.data_source

import androidx.room.*
import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Basal
import kotlinx.coroutines.flow.Flow

@Dao
interface BasalDao {

    @Query("SELECT * FROM Basal")
    fun getBasals(): Flow<List<Basal>>

    @Query("SELECT * FROM Basal WHERE userId = :userId")
    fun getBasalsByUserId(userId: Int): Flow<List<Basal>>

    @Query("SELECT * FROM Basal WHERE id = :id")
    suspend fun getBasalById(id: Int) : Basal?

    @Query("SELECT * FROM Basal ORDER BY timestamp DESC LIMIT 1")
    suspend fun getLastBasal() : Basal?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBasal(note: Basal): Long

    @Delete
    suspend fun deleteBasal(note: Basal)
}