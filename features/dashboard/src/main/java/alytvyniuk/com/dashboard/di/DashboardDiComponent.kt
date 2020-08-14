package alytvyniuk.com.dashboard.di

import alytvyniuk.com.dashboard.DashboardActivity
import alytvyniuk.com.dashboard.DashboardFeature
import dagger.Component

@Component(
    modules = [
        DashboardDiModule::class
    ],
    dependencies = [
        DashboardFeature.DashboardDependenciesProvider::class
    ]

)

/**
 * Our component can inject dependencies into activity directly, like [inject] method,
 *
 * or if we want to have dependencies with more narrowed scope, we can use sub-component,
 * like [provideSecondaryActivitySubcomponentFactory].
 * DashboardSecondaryActivitySubcomponent dependencies are scoped by @ActivityScope
 */
interface DashboardDiComponent {

    fun inject(dashboardActivity: DashboardActivity)

    fun provideSecondaryActivitySubcomponentFactory(): DashboardSecondaryActivitySubcomponent.Factory
}