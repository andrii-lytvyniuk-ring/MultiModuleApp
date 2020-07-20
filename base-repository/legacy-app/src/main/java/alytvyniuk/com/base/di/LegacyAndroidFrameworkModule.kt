package alytvyniuk.com.base.di

import alytvyniuk.com.base.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class LegacyAndroidFrameworkModule {

    @ContributesAndroidInjector
    internal abstract fun splashActivity(): SplashActivity
}