package com.example.databasekotlin.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


    @Entity()
    data class Author(
        @PrimaryKey val authorId: Int,
        val firstName: String,
        val lastName: String

    )




