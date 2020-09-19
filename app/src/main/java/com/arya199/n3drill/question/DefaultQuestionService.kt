package com.arya199.n3drill.question

import com.arya199.n3drill.BuildConfig
import com.arya199.n3drill.data.Question
import javax.inject.Inject

class DefaultQuestionService @Inject constructor(
    private val mockyQuestionService: MockyQuestionService,
    private val firebaseQuestionService: FirebaseQuestionService
) : InterfaceQuestionService {

    private val service: InterfaceQuestionService = if (BuildConfig.DEBUG) mockyQuestionService
        else firebaseQuestionService

    override suspend fun getRandomQuestion(): Question {
        TODO("Not yet implemented")
    }

    override suspend fun getQuestionById(questionId: Int): Question {
        TODO("Not yet implemented")
    }

    override suspend fun getQuestionsByLevel(questionLevel: String): List<Question> {
        return service.getQuestionsByLevel(questionLevel)
    }

}