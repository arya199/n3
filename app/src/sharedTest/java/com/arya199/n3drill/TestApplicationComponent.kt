package com.arya199.n3drill

import android.content.Context
import com.arya199.n3drill.question.InterfaceQuestionService
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [
    TestApplicationModule::class, // The definition for Retrofit objects are here
    TestDrillModule::class, // Service binder
    AndroidInjectionModule::class
])
interface TestApplicationComponent: AndroidInjector<TestN3DrillApplication> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): TestApplicationComponent
    }

    // Note to self: Both function and field reference works. So you can, for example,
    // replace this line below with var retrofit: Retrofit
    @Named("firebase")
    fun retrofit(): Retrofit

    //var mockyService: MockyService

    var questionService: InterfaceQuestionService
}