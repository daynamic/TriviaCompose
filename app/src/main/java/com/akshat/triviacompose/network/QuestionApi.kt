package com.akshat.triviacompose.network

import com.akshat.triviacompose.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {
    @GET("world.json")
    suspend fun getAllQuestions(): Question
}