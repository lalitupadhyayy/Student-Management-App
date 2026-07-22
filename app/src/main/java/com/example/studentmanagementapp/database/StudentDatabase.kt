package com.example.studentmanagementapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.studentmanagementapp.model.Student

@Database(
    entities = [Student::class],
    version = 1
)
abstract class StudentDatabase : RoomDatabase() {

    abstract fun studenDao(): StudentDao

    companion object{
        private var Instance : StudentDatabase? = null

        fun getDatabase(context: Context) : StudentDatabase{

            if (Instance == null){

                synchronized(this){
                    if (Instance == null){
                        Room.databaseBuilder(
                            context,
                            StudentDatabase::class.java,
                            "Student_Database"
                        ).build()
                    }
                }
            }
            return Instance!!
        }
    }


}