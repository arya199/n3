package com.arya199.n3drill.drill

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import retrofit2.Retrofit
import javax.inject.Inject

class DrillActivity: DaggerAppCompatActivity() {

    @Inject
    lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("DEBUG", "START")
        Log.i("DEBUG", retrofit.toString())
    }
}