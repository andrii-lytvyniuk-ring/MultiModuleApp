package alytvyniuk.com.multimoduleapp


import alytvyniuk.com.base.LegacyApplication
import alytvyniuk.com.dashboard.DashboardFeature
import android.util.Log
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

private const val TAG = "MainApplication"

class MainApplication : LegacyApplication() {

    private lateinit var multiModuleAppInjector: MultiModuleAppComponent

    override fun onCreate() {
        multiModuleAppInjector = DaggerMultiModuleAppComponent.factory().create(this)

        val dashboardDependenciesProvider =
            object : DashboardFeature.DashboardDependenciesProvider {
                override fun legacyRepositoryProvider() =
                    multiModuleAppInjector.provideLegacyRepository()
            }
        DashboardFeature.initFeature(dashboardDependenciesProvider)

        super.onCreate()
        Log.d(TAG, "App onCreate, initialize required libraries")
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return multiModuleAppInjector
    }
}