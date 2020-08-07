package alytvyniuk.com.multimoduleapp

import alytvyniuk.com.base.di.LegacyAndroidFrameworkModule
import alytvyniuk.com.base.di.LegacyDiModule
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
interface MultiModuleAppComponent: AndroidInjector<MainApplication> {

    @Component.Factory
    abstract class Factory: AndroidInjector.Factory<MainApplication>
}