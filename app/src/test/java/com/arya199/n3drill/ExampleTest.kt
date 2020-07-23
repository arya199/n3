package com.arya199.n3drill

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class ExampleTest {

    lateinit var component: TestApplicationComponent
        private set

    @Before
    fun setup() {
        val app = ApplicationProvider.getApplicationContext<Context>() as TestN3DrillApplication
        component = DaggerTestApplicationComponent.factory().create(app)
    }

    @Test
    fun testRetrofit() {
        print(component.retrofit.baseUrl())
    }
}