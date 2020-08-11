package alytvyniuk.com.multimoduleapp

import alytvyniuk.com.base.LegacyRepository
import alytvyniuk.com.base.di.LegacyAndroidFrameworkModule
import alytvyniuk.com.base.di.LegacyDiModule
import alytvyniuk.com.dashboard.di.DashboardAndroidFrameworkModule
import alytvyniuk.com.dashboard.di.DashboardDiComponent
import alytvyniuk.com.dashboard.di.DashboardDiModule
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,

        LegacyDiModule::class,
        DashboardDiModule::class,

        LegacyAndroidFrameworkModule::class,
        DashboardAndroidFrameworkModule::class
    ]
)
interface MultiModuleAppComponent : AndroidInjector<MainApplication> {

    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<MainApplication>
}

//@Module(
//    subcomponents = [
//        LegacyDiComponent::class
//    ]
//)
//class MultiModuleAppModule {
//
//
//}

