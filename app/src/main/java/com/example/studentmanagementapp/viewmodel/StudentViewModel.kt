package com.example.studentmanagementapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.studentmanagementapp.model.Student
import com.example.studentmanagementapp.repository.StudentRepository
import kotlinx.coroutines.flow.SharingStarted

class StudentViewModel(
    private val repository : StudentRepository
) : ViewModel(){

    val students = repository.getAllStudents().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    fun insertStudent(student: Student){
        repository.insertStudent(student)
    }

    fun deleteStudent(student: Student){
        repository.deleteStudent(student)
    }

    fun updateStudent(student: Student){
        repository.updateStudent(student)
    }

    fun getAllStudents() : List<Student>{
        return repository.getAllStudents()
    }

}