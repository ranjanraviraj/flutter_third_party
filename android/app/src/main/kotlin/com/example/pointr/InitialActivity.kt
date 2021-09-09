package com.example.pointr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pointrlabs.core.management.Pointr

class InitialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_initial)
                val pointr = Pointr.getPointr()
    }
}