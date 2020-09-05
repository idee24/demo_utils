package com.eghoindustries.demoutilsexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eghoindustries.demo_utils.DemoUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DemoUtil().log("Hee hhee hee.. Its Official")
    }
}