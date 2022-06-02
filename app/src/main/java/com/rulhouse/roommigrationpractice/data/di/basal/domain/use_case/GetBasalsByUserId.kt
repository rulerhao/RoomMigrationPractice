package com.oucare.bbt_oucare.feature_node.measurement.domain.use_case

import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Basal
import com.oucare.bbt_oucare.feature_node.measurement.domain.repository.BasalRepository
import com.oucare.bbt_oucare.feature_node.measurement.domain.util.Order
import com.oucare.bbt_oucare.feature_node.measurement.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetBasalsByUserId (
    private val repository: BasalRepository
) {
    operator fun invoke(
        userId: Int,
        noteOrder: Order = Order.Date(OrderType.Descending)
    ): Flow<List<Basal>> {
        return repository.getBasalsByUserId(userId).map { Basals ->
            when(noteOrder.orderType) {
                is OrderType.Ascending -> {
                    when(noteOrder) {
                        is Order.Date -> Basals.sortedBy { it.timeStamp }
                    }
                }
                is OrderType.Descending -> {
                    when(noteOrder) {
                        is Order.Date -> Basals.sortedByDescending { it.timeStamp }
                    }
                }
            }
        }
    }
}