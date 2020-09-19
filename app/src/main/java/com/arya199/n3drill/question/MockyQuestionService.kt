package com.arya199.n3drill.question

import com.arya199.n3drill.data.Question
import com.arya199.n3drill.data.api.QuestionApi
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Named

class MockyQuestionService @Inject constructor(
    @Named("mocky") retrofit: Retrofit): InterfaceQuestionService {

    private val questionApi by lazy { retrofit.create(QuestionApi::class.java) }

    override suspend fun getRandomQuestion(): Question {
        TODO("Not yet implemented")
    }

    override suspend fun getQuestionById(questionId: Int): Question {
        TODO("Not yet implemented")
    }

    override suspend fun getQuestionsByLevel(questionLevel: String): List<Question> =
        questionApi.getQuestionsByLevel(questionLevel)
}