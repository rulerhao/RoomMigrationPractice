package com.rulhouse.roommigrationpractice.data.di

import android.util.Log
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.oucare.bbt_oucare.feature_node.measurement.data.data_source.BasalDao
import com.oucare.bbt_oucare.feature_node.measurement.data.data_source.MeasurementDao
import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Basal
import com.oucare.bbt_oucare.feature_node.measurement.domain.model.Measurement

@Database(
//    entities = [Measurement::class],
    entities = [Measurement::class, Basal::class],
//    version = 1,
    version = 2
)
abstract class MeasurementDataBase : RoomDatabase() {

    abstract val measurementDao: MeasurementDao
    abstract val basaltDao: BasalDao

    companion object {
        const val DATABASE_NAME = "measurements_db"
        val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("CREATE TABLE `${Basal::class.simpleName}` (" +
                            "`id` INTEGER, " +
                            "`temperature` REAL NOT NULL, " +
                            "`part` TEXT NOT NULL, " +
                            "`timeStamp` INTEGER NOT NULL, " +
                            "`userId` INTEGER NOT NULL, " +
                            "`menstrualPeriod` INTEGER NOT NULL, " +
                            "`sexBehavior` INTEGER NOT NULL, " +
                            "PRIMARY KEY(`id`))"
                )
            }
        }
    }
}