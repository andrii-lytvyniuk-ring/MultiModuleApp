package alytvyniuk.com.base


import android.util.Log
import dagger.android.DaggerApplication

private const val TAG = "LegacyApplication"

abstract class LegacyApplication: DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "App onCreate, initialize required libraries")
    }
}