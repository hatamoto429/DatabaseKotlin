package com.example.databasekotlin.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.databasekotlin.database.entities.Book

class DeleteDao {

    @Dao
    interface DeleteDao {

        @Delete
        fun deleteData(user: Book)

    }


}