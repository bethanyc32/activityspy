package edu.uw.ischool.bchum003.activityspy

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("ActivitySpy", "onCreate event fired")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ActivitySpy", "onStart event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ActivitySpy", "onStop event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ActivitySpy", "onPause event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ActivitySpy", "onResume event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ActivitySpy", "onDestroy event fired")
        Log.e("ActivitySpy", "We're going down, Captain!")
    }
}