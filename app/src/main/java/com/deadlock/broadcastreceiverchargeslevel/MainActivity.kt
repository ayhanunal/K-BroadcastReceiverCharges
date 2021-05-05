package com.deadlock.broadcastreceiverchargeslevel

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var chargesLevelControl: ChargesLevelControl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chargesLevelControl = ChargesLevelControl()

    }


    override fun onResume() {
        super.onResume()

        val filter = IntentFilter()
        filter.addAction("android.intent.action.BATTERY_LOW")
        registerReceiver(chargesLevelControl, filter)
    }

    override fun onStop() {
        super.onStop()

        unregisterReceiver(chargesLevelControl)
    }

}