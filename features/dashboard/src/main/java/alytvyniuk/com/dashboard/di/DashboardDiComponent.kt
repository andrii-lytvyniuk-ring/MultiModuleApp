package alytvyniuk.com.dashboard.di

import dagger.Subcomponent
import javax.inject.Singleton

@Subcomponent(
    modules = [
        DashboardAndroidFrameworkModule::class
    ]
)
interface DashboardDiComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): DashboardDiComponent
    }

}