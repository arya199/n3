package com.arya199.n3drill

import com.arya199.n3drill.di.ApplicationModule
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
object TestApplicationModule {

    @Provides @Singleton @Named("mocky") fun provideMockyRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://run.mocky.io/v3/")
            .client(createClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides @Singleton @Named("firebase") fun provideFirebaseRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://mtg-replay.firebaseapp.com/")
            .client(createClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun createClient(): OkHttpClient {
        val okHttpClientBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
        if (BuildConfig.DEBUG) {
            val loggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC)
            okHttpClientBuilder.addInterceptor(loggingInterceptor)
        }
        return okHttpClientBuilder.build()
    }
}