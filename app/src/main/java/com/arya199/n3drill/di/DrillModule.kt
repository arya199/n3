package com.arya199.n3drill.di

import androidx.lifecycle.ViewModel
import com.arya199.n3drill.drill.DrillActivity
import com.arya199.n3drill.question.QuestionFragment
import com.arya199.n3drill.question.QuestionViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class DrillModule {

    @ContributesAndroidInjector()
    internal abstract fun drillActivity(): DrillActivity

    @ContributesAndroidInjector(modules = [ViewModelBuilder::class])
    internal abstract fun questionFragment(): QuestionFragment

    @Binds
    @IntoMap
    @ViewModelKey(QuestionViewModel::class)
    abstract fun bindViewModel(viewModel: QuestionViewModel): ViewModel
}