package com.arya199.n3drill.data.api

import com.arya199.n3drill.data.Mocky
import retrofit2.http.GET

internal interface TestMockyApi {

    @GET("30330fb6-0d41-4285-aebb-69fc14bc06cf") suspend fun okMessage(): Mocky
}