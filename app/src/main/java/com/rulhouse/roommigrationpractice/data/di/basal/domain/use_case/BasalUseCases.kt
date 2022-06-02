package com.oucare.bbt_oucare.feature_node.measurement.domain.use_case

import com.oucare.bbt_oucare.feature_node.basal.domain.use_case.AddBasal
import com.oucare.bbt_oucare.feature_node.basal.domain.use_case.GetLastBasal

data class BasalUseCases (
    val getBasals: GetBasals,
    val getBasalsByUserId: GetBasalsByUserId,
    val getLastBasal: GetLastBasal,
    val deleteBasal: DeleteBasal,
    val addBasal: AddBasal,
    val getBasal: GetBasal
)
