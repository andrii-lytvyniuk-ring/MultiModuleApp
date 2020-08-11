package alytvyniuk.com.dashboard.di

import alytvyniuk.com.dashboard.DashboardRepository
import dagger.Module
import dagger.Provides

@Module
class DashboardDiModule {

    @Provides
    fun provideDashboardRepository() : DashboardRepository {
        return DashboardRepository()
    }
}