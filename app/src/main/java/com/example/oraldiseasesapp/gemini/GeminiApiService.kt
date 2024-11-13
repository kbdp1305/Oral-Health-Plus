package com.example.oraldiseasesapp.gemini

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface GeminiApiService {
    @Headers("Authorization:AIzaSyBz9kj-iKd2-sgEC5To6lTxInWFYCIBJmc", "Content-Type: application/json")
    @POST("v1/message")
    fun getBotResponse(@Body request: GeminiRequest): Call<GeminiResponse>
}
