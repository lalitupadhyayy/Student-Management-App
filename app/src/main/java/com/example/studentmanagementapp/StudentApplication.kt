package com.example.studentmanagementapp

import android.app.Application
import com.example.studentmanagementapp.database.StudentDatabase
import com.example.studentmanagementapp.repository.StudentRepository

class StudentApplication : Application() {

    val database by lazy {
        StudentDatabase.getDatabase(this)
    }

    val repository by lazy {
        StudentRepository(database.studenDao())
    }
}