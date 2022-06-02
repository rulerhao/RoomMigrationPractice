package com.oucare.bbt_oucare.feature_node.measurement.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
