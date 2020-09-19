package com.arya199.n3drill.data.api

import com.arya199.n3drill.data.Question
import retrofit2.http.GET
import retrofit2.http.Path

interface QuestionApi {

    companion object {
        private const val PARAM_QUESTION_ID = "questionId"
        private const val PARAM_QUESTION_LEVEL = "questionLevel"
    }

    @GET("") suspend fun getRandomQuestion(): Question
    @GET("") suspend fun getQuestionById(@Path(PARAM_QUESTION_ID) questionId: Int): Question
    @GET("f5905f41-1fa4-4c87-b7b3-{$PARAM_QUESTION_LEVEL}") suspend fun getQuestionsByLevel(@Path(PARAM_QUESTION_LEVEL) questionLevel: String):
            List<Question>
}
