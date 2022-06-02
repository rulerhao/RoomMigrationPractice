package com.rulhouse.roommigrationpractice.data.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    @Singleton
    fun provideMeasurementDatabase(app: Application): MeasurementDataBase {
        return Room.databaseBuilder(
            app,
            MeasurementDataBase::class.java,
            MeasurementDataBase.DATABASE_NAME
        )
            .addMigrations(MeasurementDataBase.MIGRATION_1_2)
            .build()
    }
}