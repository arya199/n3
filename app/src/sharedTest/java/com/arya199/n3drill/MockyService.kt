package com.arya199.n3drill

import com.arya199.n3drill.data.Mocky
import com.arya199.n3drill.data.api.TestMockyApi
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@Singleton
class MockyService @Inject constructor(@Named("mocky") retrofit: Retrofit): TestMockyApi {

    private val mockyApi by lazy { retrofit.create(TestMockyApi::class.java) }

    override suspend fun okMessage(): Mocky = mockyApi.okMessage()
}