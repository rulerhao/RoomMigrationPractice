package com.oucare.bbt_oucare.feature_node.measurement.domain.util

sealed class Order (val orderType: OrderType) {
    class Date(orderType: OrderType): Order(orderType)

    fun copy(orderType: OrderType): Order {
        return when(this) {
            is Date -> Date(orderType)
        }
    }
}
