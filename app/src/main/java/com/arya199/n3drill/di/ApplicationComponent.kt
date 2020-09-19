package com.arya199.n3drill.di

import android.content.Context
import com.arya199.n3drill.N3DrillApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [
    DrillModule::class, // Activities, Fragments, Services are here.
    ApplicationModule::class, // The object graph for Retrofit is here
    AndroidInjectionModule::class])
interface ApplicationComponent: AndroidInjector<N3DrillApplication> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): ApplicationComponent
    }
}