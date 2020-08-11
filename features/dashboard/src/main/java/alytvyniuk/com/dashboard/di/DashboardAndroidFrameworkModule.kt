package alytvyniuk.com.dashboard.di

import alytvyniuk.com.dashboard.DashboardActivity
import alytvyniuk.com.dashboard.DashboardSecondaryActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class DashboardAndroidFrameworkModule {

    @ContributesAndroidInjector
    internal abstract fun dashboardActivity(): DashboardActivity
    @ContributesAndroidInjector
    internal abstract fun dashboardSecondaryActivity(): DashboardSecondaryActivity
}