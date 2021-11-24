package com.example.databasekotlin.database.dto

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.databasekotlin.database.entities.Author
import com.example.databasekotlin.database.entities.AuthorBookCrossRef
import com.example.databasekotlin.database.entities.Book

data class AuthorWithBooks (

        @Embedded val author: Author,
        @Relation(
            parentColumn = "authorId",
            entityColumn = "bookId",
            associateBy = Junction(AuthorBookCrossRef::class)
        )
        val books: List<Book>
)