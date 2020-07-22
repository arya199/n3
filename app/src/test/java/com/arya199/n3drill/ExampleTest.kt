package com.arya199.n3drill

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import retrofit2.Retrofit

@RunWith(RobolectricTestRunner::class)
class ExampleTest {

    lateinit var component: TestApplicationComponent
        private set

    lateinit var retrofit: Retrofit
        private set

    @Before fun setup() {
        val app = ApplicationProvider.getApplicationContext<Context>() as TestN3DrillApplication
        component = DaggerTestApplicationComponent.factory().create(app)
    }

    @Test
    fun got_retrofit() {
        retrofit = component.retrofit
        print(retrofit.baseUrl().toString())
    }
}