package com.example.studentmanagementapp.repository

import com.example.studentmanagementapp.database.StudentDao
import com.example.studentmanagementapp.model.Student
import kotlinx.coroutines.flow.Flow

class StudentRepository(
    private val studentDao: StudentDao
) {
    fun insertStudent(student: Student){
        studentDao.insertStudent(student)
    }

    fun deleteStudent(student: Student){
        studentDao.deleteStudent(student)
    }

    fun updateStudent(student: Student){
        studentDao.updateStudent(student)
    }

    fun getAllStudents(): Flow<List<Student>> {
        return studentDao.getAllStudents()
    }
}