package com.arya199.n3drill

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class TestN3DrillApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerTestApplicationComponent.factory().create(applicationContext)
    }

}