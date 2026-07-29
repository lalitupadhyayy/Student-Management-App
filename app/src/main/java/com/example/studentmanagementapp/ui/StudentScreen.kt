package com.example.studentmanagementapp.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import com.example.studentmanagementapp.viewmodel.StudentViewModel

@Composable
fun StudentScreen(
    viewModel: StudentViewModel
) {
    val students by viewModel.allStudents.collectAsState(
        initial = emptyList()
    )

    LazyColumn {
        items(students){ student ->

            Text(
                text = student.name
            )

        }
    }
    
}