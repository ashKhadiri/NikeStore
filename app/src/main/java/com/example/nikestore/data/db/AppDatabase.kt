package com.example.nikestore.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.nikestore.data.Product
import com.sevenlearn.nikestore.data.repo.source.ProductLocalDataSource

@Database(entities = [Product::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun productDao(): ProductLocalDataSource
}