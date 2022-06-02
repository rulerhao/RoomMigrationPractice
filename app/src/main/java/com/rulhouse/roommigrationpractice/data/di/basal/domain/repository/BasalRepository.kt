package com.oucare.bbt_oucare.feature_node.measurement.domain.repository

import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Basal
import kotlinx.coroutines.flow.Flow

interface BasalRepository {
    fun getBasals(): Flow<List<Basal>>

    fun getBasalsByUserId(userId: Int): Flow<List<Basal>>

    suspend fun getBasalById(id: Int): Basal?

    suspend fun getLastBasal(): Basal?

    suspend fun insertBasal(measurement: Basal): Long

    suspend fun deleteBasal(measurement: Basal)
}