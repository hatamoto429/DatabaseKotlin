package com.example.databasekotlin

import android.app.Application
import androidx.room.Room

import com.example.databasekotlin.database.StoreDatabase
import com.example.databasekotlin.database.dto.AuthorWithBooks

import com.example.databasekotlin.database.entities.Author
import com.example.databasekotlin.database.entities.Book


class StoreApplication : Application() {

    lateinit var database: StoreDatabase
        private set

    override fun onCreate() {
        super.onCreate()

        database = Room
            .databaseBuilder(
                applicationContext,
                StoreDatabase::class.java,
                "store-database-name"
            )
            .build()

        val insertDao = database.insertDao()
        val deleteDao = database.deleteDao()

        val books = listOf(
            Book(1, "HarryPotter1", 20f, 500),
            Book(1, "HarryPotter2", 20f, 500)
        )

        val authors = listOf(
            Author(2, "Joanne", "Rowling")
        )


    }
}

// https://stackoverflow.com/questions/47274677/room-cannot-find-implementation