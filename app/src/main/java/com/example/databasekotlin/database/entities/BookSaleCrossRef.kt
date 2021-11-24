package com.example.databasekotlin.database.entities

import androidx.room.Entity

class BookSaleCrossRef {

    @Entity(primaryKeys = ["bookId", "saleId"])
    data class BookSaleCrossRef(
        val bookId: Int,
        val saleId: Int
    )

}