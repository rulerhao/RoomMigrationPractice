package com.oucare.bbt_oucare.feature_node.measurement.domain.use_case

import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Measurement
import com.oucare.bbt_oucare.feature_node.measurement.domain.repository.MeasurementRepository
import com.oucare.bbt_oucare.feature_node.measurement.domain.util.Order
import com.oucare.bbt_oucare.feature_node.measurement.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetMeasurements (
    private val repository: MeasurementRepository
) {
    operator fun invoke(
        noteOrder: Order = Order.Date(OrderType.Descending)
    ): Flow<List<Measurement>> {
        return repository.getMeasurements().map { Measurements ->
            when(noteOrder.orderType) {
                is OrderType.Ascending -> {
                    when(noteOrder) {
                        is Order.Date -> Measurements.sortedBy { it.timeStamp }
                    }
                }
                is OrderType.Descending -> {
                    when(noteOrder) {
                        is Order.Date -> Measurements.sortedByDescending { it.timeStamp }
                    }
                }
            }
        }
    }
}