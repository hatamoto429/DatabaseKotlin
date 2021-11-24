package com.example.databasekotlin.database

import android.app.Application
import androidx.room.Room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.databasekotlin.database.daos.DeleteDao
import com.example.databasekotlin.database.daos.InsertDao
import com.example.databasekotlin.database.entities.*


@Database(
    entities = [
        Author::class,
        Book::class,
        Sale::class,
        AuthorBookCrossRef::class,
        BookSaleCrossRef::class
    ],
    version = 1
)

abstract class StoreDatabase : RoomDatabase() {
    abstract fun insertDao(): InsertDao
    abstract fun deleteDao(): DeleteDao
}

