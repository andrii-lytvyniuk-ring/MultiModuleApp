package alytvyniuk.com.multimoduleapp


import alytvyniuk.com.base.LegacyApplication
import android.util.Log
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

private const val TAG = "MainApplication"

class MainApplication: LegacyApplication() {

    private lateinit var multiModuleAppInjector: AndroidInjector<out DaggerApplication>

    override fun onCreate() {
        multiModuleAppInjector = DaggerMultiModuleAppComponent.factory().create(this)
        super.onCreate()
        Log.d(TAG, "App onCreate, initialize required libraries")
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return multiModuleAppInjector
    }
}