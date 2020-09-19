package com.arya199.n3drill

import com.arya199.n3drill.question.DefaultQuestionService
import com.arya199.n3drill.question.InterfaceQuestionService
import dagger.Binds
import dagger.Module

@Module
abstract class TestDrillModule {

    @Binds
    internal abstract fun bindQuestionService(questionService: DefaultQuestionService):
            InterfaceQuestionService
}