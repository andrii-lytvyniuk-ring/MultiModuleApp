package alytvyniuk.com.dashboard.di

import alytvyniuk.com.dashboard.DashboardSecondaryActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [DashboardSecondaryActivityModule::class])
interface DashboardSecondaryActivitySubcomponent {

    @Subcomponent.Factory
    interface Factory{
        fun create() : DashboardSecondaryActivitySubcomponent
    }

    fun inject(dashboardSecondaryActivity: DashboardSecondaryActivity)
}