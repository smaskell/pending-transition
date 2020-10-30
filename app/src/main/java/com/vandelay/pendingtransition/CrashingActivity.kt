package com.vandelay.pendingtransition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CrashingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crashing)
        findViewById<Button>(R.id.button_finish).setOnClickListener {
            finish()
        }
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(0, 0)
    }
}