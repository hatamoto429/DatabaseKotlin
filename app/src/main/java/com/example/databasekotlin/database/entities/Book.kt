package com.example.databasekotlin.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


    @Entity()
    data class Book(
        @PrimaryKey val bookId: Int,
        val title: String,
        val price: Float,
        val pages: Int

    )





