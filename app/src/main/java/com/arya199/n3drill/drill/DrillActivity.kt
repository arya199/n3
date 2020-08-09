package com.arya199.n3drill.drill

import android.os.Bundle
import com.arya199.n3drill.R
import dagger.android.support.DaggerAppCompatActivity

class DrillActivity: DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drill_act)
    }
}