package com.oucare.bbt_oucare.feature_node.basal.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object BasalModule {

//    @Provides
//    @Singleton
//    fun provideBasalRepository(db: MeasurementDataBase): BasalRepository {
//        return BasalRepositoryImpl(db.basaltDao)
//    }
//
//    @Provides
//    @Singleton
//    fun provideBasalUseCases(repository: BasalRepository): BasalUseCases {
//        return BasalUseCases(
//            getBasals = GetBasals(repository),
//            getBasalsByUserId = GetBasalsByUserId(repository),
//            getLastBasal = GetLastBasal(repository),
//            deleteBasal = DeleteBasal(repository),
//            addBasal = AddBasal(repository),
//            getBasal = GetBasal(repository)
//        )
//    }
}