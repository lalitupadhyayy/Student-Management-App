package com.example.studentmanagementapp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.studentmanagementapp.model.Student
import com.example.studentmanagementapp.viewmodel.StudentViewModel

@Composable
fun StudentScreen(
    viewModel: StudentViewModel
) {
    val students by viewModel.allStudents.collectAsState(
        initial = emptyList()
    )

    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var course by remember { mutableStateOf("") }

    Column {

        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Enter your name") },
            modifier = Modifier
                .fillMaxWidth()

        )

        TextField(
            value = age,
            onValueChange = { age = it },
            label = { Text("Enter your age") },
            modifier = Modifier
                .fillMaxWidth()

        )

        TextField(
            value = course,
            onValueChange = { course = it },
            label = { Text("Enter your course") },
            modifier = Modifier
                .fillMaxWidth()

        )

        Button(
            onClick = {

                val student = Student(
                    name = name,
                    age = age.toInt(),
                    course = course
                )

                viewModel.insertStudent(student)


            },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text("Add Student")
        }



        LazyColumn {
            items(students) { student ->

                StudentCard(student = student,
                    onDeleteClick = {
                        viewModel.deleteStudent(it)
                    })

            }
        }

    }
}