package com.example.studentmanagementapp.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.studentmanagementapp.model.Student
import kotlinx.coroutines.flow.Flow

@Dao
interface StudentDao {

    @Insert
    fun insertStudent(student: Student)

    @Delete
    fun deleteStudent(student: Student)

    @Update
    fun updateStudent(student: Student)

    @Query("SELECT * FROM student_table")
    fun getAllStudents(): Flow<List<Student>>
}