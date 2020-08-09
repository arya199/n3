package com.arya199.n3drill.di

import com.arya199.n3drill.question.QuestionFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules=[])
interface QuestionFragmentSubComponent: AndroidInjector<QuestionFragment> {

    @Subcomponent.Factory
    interface Factory: AndroidInjector.Factory<QuestionFragment> {}
}