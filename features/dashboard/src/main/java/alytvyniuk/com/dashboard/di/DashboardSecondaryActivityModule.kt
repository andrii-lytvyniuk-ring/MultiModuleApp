package alytvyniuk.com.dashboard.di

import alytvyniuk.com.dashboard.Something
import dagger.Module
import dagger.Provides

@Module
class DashboardSecondaryActivityModule {

    @ActivityScope
    @Provides
    fun provideSomething() = Something()
}