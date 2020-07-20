package alytvyniuk.com.base.di

import alytvyniuk.com.base.LegacyRepository
import dagger.Module
import dagger.Provides

@Module
class LegacyDiModule {

    @Provides
    fun provideLegacyRepository() : LegacyRepository {
        return LegacyRepository()
    }
}