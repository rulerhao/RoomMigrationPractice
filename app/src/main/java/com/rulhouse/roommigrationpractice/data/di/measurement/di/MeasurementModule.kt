package com.rulhouse.roommigrationpractice.data.di.measurement.di

import com.oucare.bbt_oucare.feature_node.measurement.data.repository.MeasurementRepositoryImpl
import com.oucare.bbt_oucare.feature_node.measurement.domain.repository.MeasurementRepository
import com.oucare.bbt_oucare.feature_node.measurement.domain.use_case.*
import com.rulhouse.roommigrationpractice.data.di.MeasurementDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MeasurementModule {

    @Provides
    @Singleton
    fun provideMeasurementRepository(db: MeasurementDataBase): MeasurementRepository {
        return MeasurementRepositoryImpl(db.measurementDao)
    }

    @Provides
    @Singleton
    fun provideMeasurementUseCases(repository: MeasurementRepository): MeasurementUseCases {
        return MeasurementUseCases(
            getMeasurements = GetMeasurements(repository),
            getMeasurementsByUserId = GetMeasurementsByUserId(repository),
            deleteMeasurement = DeleteMeasurement(repository),
            addMeasurement = AddMeasurement(repository),
            getMeasurement = GetMeasurement(repository)
        )
    }
}