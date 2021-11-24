package com.example.databasekotlin.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


    @Entity
    data class Sale(
        @PrimaryKey val saleId: Int,
        val discount: Float
    )
