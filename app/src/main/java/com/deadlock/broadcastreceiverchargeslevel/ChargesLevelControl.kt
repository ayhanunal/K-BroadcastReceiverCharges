package com.deadlock.broadcastreceiverchargeslevel

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ChargesLevelControl : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Charges down ...", Toast.LENGTH_SHORT).show()
    }



}