package com.arya199.n3drill

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(modules = [
    TestApplicationModule::class,
    AndroidInjectionModule::class
])
interface TestApplicationComponent: AndroidInjector<TestN3DrillApplication> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): TestApplicationComponent
    }

    val retrofit: Retrofit
}