package com.example.studentmanagementapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.studentmanagementapp.model.Student
import com.example.studentmanagementapp.repository.StudentRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class StudentViewModel(
    private val repository : StudentRepository
) : ViewModel(){


    fun insertStudent(student: Student){
        viewModelScope.launch {
            repository.insertStudent(student)
        }

    }

    fun deleteStudent(student: Student){
        viewModelScope.launch {
            repository.deleteStudent(student)
        }
    }

    fun updateStudent(student: Student){
        viewModelScope.launch {
            repository.updateStudent(student)
        }
    }

    val allStudents : Flow<List<Student>> =
         repository.getAllStudents()


}