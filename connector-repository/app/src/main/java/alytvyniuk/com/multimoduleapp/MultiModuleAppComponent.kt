package alytvyniuk.com.multimoduleapp

import alytvyniuk.com.base.LegacyRepository
import alytvyniuk.com.base.di.LegacyAndroidFrameworkModule
import alytvyniuk.com.base.di.LegacyDiComponent
import alytvyniuk.com.base.di.LegacyDiModule
import dagger.BindsInstance
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
interface MultiModuleAppComponent : AndroidInjector<MainApplication>, LegacyDiComponent {

    fun provideLegacyRepository(): LegacyRepository

    @Component.Factory
    abstract class Factory  {
        abstract fun create(@BindsInstance instance: MainApplication): MultiModuleAppComponent
    }
}
