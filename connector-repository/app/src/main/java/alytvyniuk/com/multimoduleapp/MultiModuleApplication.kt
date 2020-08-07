package alytvyniuk.com.multimoduleapp


import alytvyniuk.com.base.LegacyApplication
import android.util.Log
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

private const val TAG = "MainApplication"

class MainApplication: LegacyApplication() {

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "App onCreate, initialize required libraries")
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerMultiModuleAppComponent.factory().create(this)
    }
}