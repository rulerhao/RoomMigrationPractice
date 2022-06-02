package com.oucare.bbt_oucare.feature_node.measurement.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.oucare.bbt_oucare.feature_node.measurement.domain.util.MeasurementPart

@Entity
data class Measurement(
    val temperature: Float,
    val userId: Int,
    val timeStamp: Long,
    @PrimaryKey val id: Int? = null
) {
}