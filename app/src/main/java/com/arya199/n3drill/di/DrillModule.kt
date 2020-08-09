package com.arya199.n3drill.di

import androidx.lifecycle.ViewModel
import com.arya199.n3drill.drill.DrillActivity
import com.arya199.n3drill.question.QuestionFragment
import com.arya199.n3drill.question.QuestionViewModel
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [DrillActivitySubComponent::class])
abstract class DrillModule {

    @ContributesAndroidInjector(modules = [ViewModelBuilder::class])
    internal abstract fun questionFragment(): QuestionFragment

    @Binds
    @IntoMap
    @ClassKey(DrillActivity::class)
    abstract fun bindDrillActivityInjectorFactory(factory: DrillActivitySubComponent.Factory):
            AndroidInjector.Factory<*>

    @Binds
    @IntoMap
    @ViewModelKey(QuestionViewModel::class)
    abstract fun bindViewModel(viewModel: QuestionViewModel): ViewModel
}