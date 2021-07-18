package com.denbofa.Assigmentweek7

import retrofit2.http.GET

interface StudentService {
    @GET("students")
    suspend fun getAllStudents(): List<StudentModel>


}