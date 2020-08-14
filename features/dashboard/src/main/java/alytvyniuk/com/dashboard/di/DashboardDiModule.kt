package alytvyniuk.com.dashboard.di

import alytvyniuk.com.dashboard.DashboardRepository
import dagger.Module
import dagger.Provides

@Module(subcomponents = [DashboardSecondaryActivitySubcomponent::class])
internal class DashboardDiModule {

    @Provides
    fun provideDashboardRepository() : DashboardRepository {
        return DashboardRepository()
    }
}