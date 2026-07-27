package com.example.studentmanagementapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.studentmanagementapp.model.Student
import com.example.studentmanagementapp.repository.StudentRepository
import kotlinx.coroutines.flow.Flow

class StudentViewModel(
    private val repository : StudentRepository
) : ViewModel(){



    fun insertStudent(student: Student){
        repository.insertStudent(student)
    }

    fun deleteStudent(student: Student){
        repository.deleteStudent(student)
    }

    fun updateStudent(student: Student){
        repository.updateStudent(student)
    }

    fun getAllStudents(): Flow<List<Student>> {
        return repository.getAllStudents()
    }

}