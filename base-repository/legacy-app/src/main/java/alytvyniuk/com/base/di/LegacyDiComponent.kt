package alytvyniuk.com.base.di

import alytvyniuk.com.base.ConnectivityApi

interface LegacyDiComponent {

    fun inject(connectivityApi: ConnectivityApi)
}