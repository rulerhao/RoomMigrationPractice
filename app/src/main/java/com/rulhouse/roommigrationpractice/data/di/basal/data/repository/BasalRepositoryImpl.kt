package com.oucare.bbt_oucare.feature_node.measurement.data.repository

import com.oucare.bbt_oucare.feature_node.measurement.data.data_source.BasalDao
import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Basal
import com.oucare.bbt_oucare.feature_node.measurement.domain.repository.BasalRepository
import kotlinx.coroutines.flow.Flow

class BasalRepositoryImpl (
    private val dao: BasalDao
) : BasalRepository {

    override fun getBasals(): Flow<List<Basal>> {
        return dao.getBasals()
    }

    override fun getBasalsByUserId(userId: Int): Flow<List<Basal>> {
        return dao.getBasalsByUserId(userId)
    }

    override suspend fun getBasalById(id: Int): Basal? {
        return dao.getBasalById(id)
    }

    override suspend fun getLastBasal(): Basal? {
        return dao.getLastBasal()
    }

    override suspend fun insertBasal(basal: Basal): Long {
        return dao.insertBasal(basal)
    }

    override suspend fun deleteBasal(basal: Basal) {
        dao.deleteBasal(basal)
    }
}