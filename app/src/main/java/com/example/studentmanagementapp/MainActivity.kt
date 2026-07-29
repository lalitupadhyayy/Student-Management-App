package com.example.studentmanagementapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.studentmanagementapp.model.Student
import com.example.studentmanagementapp.ui.theme.StudentManagementAppTheme
import com.example.studentmanagementapp.ui.StudentScreen
import com.example.studentmanagementapp.viewmodel.StudentViewModel
import com.example.studentmanagementapp.viewmodel.StudentViewModelFactory

class MainActivity : ComponentActivity() {

    private val studentViewModel : StudentViewModel by viewModels{
        StudentViewModelFactory(
            (application as StudentApplication).repository
        )

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            StudentManagementAppTheme {
                StudentScreen(
                    viewModel = studentViewModel
                )


            }
        }
    }
}

