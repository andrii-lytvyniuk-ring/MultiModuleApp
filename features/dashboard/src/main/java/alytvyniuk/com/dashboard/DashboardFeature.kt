package alytvyniuk.com.dashboard

import alytvyniuk.com.base.LegacyRepository
import alytvyniuk.com.dashboard.di.DaggerDashboardDiComponent
import alytvyniuk.com.dashboard.di.DashboardDiComponent

object DashboardFeature {

    lateinit var component: DashboardDiComponent

    fun initFeature(dashboardDependenciesProvider: DashboardDependenciesProvider) {
        component = DaggerDashboardDiComponent
            .builder()
            .dashboardDependenciesProvider(dashboardDependenciesProvider)
            .build()
    }

    interface DashboardDependenciesProvider {
        fun legacyRepositoryProvider(): LegacyRepository
    }
}