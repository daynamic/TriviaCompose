package com.akshat.triviacompose.repository

import android.util.Log
import com.akshat.triviacompose.data.DataOrException
import com.akshat.triviacompose.model.QuestionItem
import com.akshat.triviacompose.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(
    private val api: QuestionApi) {
    private val dataOrException =
        DataOrException<ArrayList<QuestionItem>,
                Boolean,
                Exception>()

    suspend fun getAllQuestions(): DataOrException<ArrayList<QuestionItem>,
            Boolean, Exception>{
        try {
            dataOrException.loading = true
            dataOrException.data = api.getAllQuestions()
            if (dataOrException.data.toString().isNotEmpty())
                dataOrException.loading = false
        }
        catch (exception: Exception){
            dataOrException.e = exception
            Log.d("REQUEST","getAllQuestions: ${dataOrException.e!!.localizedMessage}")
        }

        return dataOrException
    }
}