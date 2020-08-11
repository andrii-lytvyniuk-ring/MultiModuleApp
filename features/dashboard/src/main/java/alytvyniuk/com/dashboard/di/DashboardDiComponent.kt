package alytvyniuk.com.dashboard.di

import alytvyniuk.com.dashboard.DashboardRepository
import alytvyniuk.com.dashboard.DashboardSecondaryActivity
import dagger.Subcomponent

@Subcomponent(
    modules = [
        DashboardDiModule::class
    ]
)
interface DashboardDiComponent {

    fun inject(dashboardSecondaryActivity: DashboardSecondaryActivity)
}