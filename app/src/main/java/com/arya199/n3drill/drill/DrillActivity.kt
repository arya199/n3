package com.arya199.n3drill.drill

import android.os.Bundle
import android.util.Log
import com.arya199.n3drill.R
import dagger.android.support.DaggerAppCompatActivity
import retrofit2.Retrofit
import javax.inject.Inject

class DrillActivity: DaggerAppCompatActivity() {

    @Inject
    lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drill_act)
    }
}