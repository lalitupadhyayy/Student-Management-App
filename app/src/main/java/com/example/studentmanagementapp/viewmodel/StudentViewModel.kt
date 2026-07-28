package com.example.studentmanagementapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.studentmanagementapp.model.Student
import com.example.studentmanagementapp.repository.StudentRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

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

    val students: StateFlow<List<Student>> =
        repository.getAllStudents()
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5000),
                initialValue = emptyList()
            )

}