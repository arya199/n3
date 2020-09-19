package com.arya199.n3drill.question

import com.arya199.n3drill.data.Question
import javax.inject.Inject

class FirebaseQuestionService @Inject constructor(): InterfaceQuestionService {

    override suspend fun getRandomQuestion(): Question {
        TODO("Not yet implemented")
    }

    override suspend fun getQuestionById(questionId: Int): Question {
        TODO("Not yet implemented")
    }

    override suspend fun getQuestionsByLevel(questionLevel: String): List<Question> {
        TODO("Not yet implemented")
    }

}