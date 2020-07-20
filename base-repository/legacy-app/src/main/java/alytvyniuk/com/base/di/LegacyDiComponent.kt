package alytvyniuk.com.base.di

import alytvyniuk.com.base.MainApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        LegacyDiModule::class,
        LegacyAndroidFrameworkModule::class
    ]
)
interface LegacyDiComponent: AndroidInjector<MainApplication> {

    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<MainApplication>
}