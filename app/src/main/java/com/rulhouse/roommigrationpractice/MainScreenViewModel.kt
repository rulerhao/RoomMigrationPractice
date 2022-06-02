package com.rulhouse.roommigrationpractice

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Measurement
import com.oucare.bbt_oucare.feature_node.measurement.domain.use_case.MeasurementUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel @Inject constructor(
    private val measurementUseCases: MeasurementUseCases
): ViewModel() {
    init {
        viewModelScope.launch {
            measurementUseCases.addMeasurement(Measurement(temperature = 35.0f, userId = 1, timeStamp = System.currentTimeMillis()))
        }
    }
}