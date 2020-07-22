package com.arya199.n3drill.di

import com.arya199.n3drill.drill.DrillActivity
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [DrillActivitySubComponent::class])
abstract class DrillModule {

    @Binds
    @IntoMap
    @ClassKey(DrillActivity::class)
    abstract fun bindDrillActivityInjectorFactory(factory: DrillActivitySubComponent.Factory):
            AndroidInjector.Factory<*>
}