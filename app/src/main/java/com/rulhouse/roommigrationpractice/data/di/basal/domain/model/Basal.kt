package com.oucare.bbt_oucare.feature_node.measurement.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.oucare.bbt_oucare.feature_node.measurement.domain.util.MeasurementPart

@Entity
data class Basal(
    val temperature: Float,
    val part: MeasurementPart,
    val timeStamp: Long,
    val userId: Int,
    val menstrualPeriod: Boolean,
    val sexBehavior: Boolean,
    @PrimaryKey val id: Int? = null
) {
}