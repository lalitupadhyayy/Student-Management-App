package com.example.studentmanagementapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.studentmanagementapp.model.Student

@Database(
    entities = [Student::class],
    version = 1
)
abstract class StudentDatabase : RoomDatabase() {

    abstract fun studenDao(): StudentDao

}