package com.arya199.n3drill.di

import com.arya199.n3drill.drill.DrillActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [])
interface DrillActivitySubComponent: AndroidInjector<DrillActivity> {

    @Subcomponent.Factory
    interface Factory: AndroidInjector.Factory<DrillActivity> {}
}