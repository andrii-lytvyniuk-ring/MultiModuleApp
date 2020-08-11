package alytvyniuk.com.dashboard.di

import alytvyniuk.com.dashboard.DashboardRepository
import dagger.Subcomponent

@Subcomponent(
    modules = [
        DashboardDiModule::class
    ]
)
interface DashboardDiComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): DashboardDiComponent
    }

}