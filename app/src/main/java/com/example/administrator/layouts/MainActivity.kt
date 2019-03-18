package com.example.administrator.layouts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import  android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivityLife", "调用onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivityLife", "调用onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivityLife", "调用onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivityLife", "调用onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivityLife", "调用onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivityLife", "调用onDestroy")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivityLife", "调用onRestart")

    }

}
