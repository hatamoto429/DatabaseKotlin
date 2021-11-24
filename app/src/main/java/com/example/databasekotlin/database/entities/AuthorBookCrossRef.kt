package com.example.databasekotlin.database.entities

import androidx.room.Entity

class AuthorBookCrossRef {

    @Entity(primaryKeys = ["authorId", "bookId"])
    data class AuthorBookCrossRef(
        val authorId: Int,
        val bookId: Int
    )

}