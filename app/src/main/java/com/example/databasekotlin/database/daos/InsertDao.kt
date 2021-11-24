package com.example.databasekotlin.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.databasekotlin.database.entities.Book

class InsertDao {

    @Dao
    interface BookDao {
        @Insert
        fun insertData(vararg users: Book)

    }


}