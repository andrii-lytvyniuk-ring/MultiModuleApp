package alytvyniuk.com.base


import alytvyniuk.com.base.di.DaggerLegacyDiComponent
import alytvyniuk.com.base.di.MainAndroidInjector
import android.util.Log
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import java.lang.IllegalArgumentException

private const val TAG = "MainApplication"

class MainApplication: DaggerApplication() {

    var applicationInjector = MainAndroidInjector()

    override fun onCreate() {
        applicationInjector.map[javaClass.`package`.toString()] = DaggerLegacyDiComponent.factory().create(this) as AndroidInjector<Any>
        super.onCreate()
        Log.d(TAG, "App onCreate, initialize required libraries")
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerLegacyDiComponent.factory().create(this)
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return applicationInjector as AndroidInjector<Any>
    }
}