package alytvyniuk.com.dashboard.di

import alytvyniuk.com.base.MainApplication
import alytvyniuk.com.base.di.LegacyAndroidFrameworkModule
import alytvyniuk.com.base.di.LegacyDiModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        DashboardAndroidFrameworkModule::class,
        AndroidInjectionModule::class,
        LegacyDiModule::class,
        LegacyAndroidFrameworkModule::class
    ]
)
interface DashboardDiComponent: AndroidInjector<MainApplication> {

    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<MainApplication>
}