package com.example.studentmanagementapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.studentmanagementapp.model.Student

@Composable
fun StudentCard(student: Student) {

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)

    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                text = student.name

            )
            Spacer(
                modifier = Modifier.height(16.dp)
            )

            Text(
                text = "Course: ${student.course}"
            )
            Text(
                text = " Age: ${student.age}"
            )

            Spacer(Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
            ) {
                Button(
                    onClick = {}
                ) {
                    Text("Edit")
                }

                Spacer(Modifier.width(10.dp))

                Button(
                    onClick = {}
                ) {
                    Text("Delete")
                }
            }
        }
    }
}