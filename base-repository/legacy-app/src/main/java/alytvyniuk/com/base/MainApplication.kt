package alytvyniuk.com.base

import android.app.Application
import android.util.Log

private const val TAG = "MainApplication"

class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "App onCreate, initialize required libraries")
    }
}