package com.vandelay.pendingtransition

import android.app.Application
import android.os.StrictMode

class MyApplication : Application() {
    override fun onCreate() {
        StrictMode.setVmPolicy(
            StrictMode.VmPolicy.Builder()
                .detectLeakedSqlLiteObjects()
                .detectLeakedClosableObjects()
                .penaltyLog()
                .penaltyDeath()
                .build()
        )
        super.onCreate()
    }
}