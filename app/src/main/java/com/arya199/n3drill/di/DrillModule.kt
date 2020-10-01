package com.arya199.n3drill.di

import androidx.lifecycle.ViewModel
import com.arya199.n3drill.drill.DrillActivity
import com.arya199.n3drill.question.*
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class DrillModule {

    // ContributesAndroidInjector instructs Dagger to generate, in this case,
    // a DrillActivitySubcommponent
    @ContributesAndroidInjector()
    internal abstract fun drillActivity(): DrillActivity

    @ContributesAndroidInjector(modules = [ViewModelBuilder::class])
    internal abstract fun questionFragment(): QuestionFragment

    @ContributesAndroidInjector(modules = [ViewModelBuilder::class])
    internal abstract fun questionItemFragment(): QuestionItemFragment

    @Binds
    @IntoMap
    @ViewModelKey(QuestionViewModel::class)
    abstract fun bindViewModel(viewModel: QuestionViewModel): ViewModel

    @Binds
    internal abstract fun bindQuestionService(questionService: DefaultQuestionService):
            InterfaceQuestionService
}