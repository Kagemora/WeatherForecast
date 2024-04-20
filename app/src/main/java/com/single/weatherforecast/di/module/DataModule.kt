package com.single.weatherforecast.di.module

import android.content.Context
import com.single.weatherforecast.data.cache.AppDatabase
import com.single.weatherforecast.data.cache.FavouriteCityDao
import com.single.weatherforecast.data.network.api.ApiFactory
import com.single.weatherforecast.data.network.api.ApiService
import com.single.weatherforecast.di.anotation.ApplicationScope
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @[Provides
    ApplicationScope]
    fun provideAppDatabase(context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }
    @[Provides
    ApplicationScope]
    fun provideFavouriteCityDao(appDatabase: AppDatabase): FavouriteCityDao {
        return appDatabase.favouriteCityDao()
    }

    @[Provides
    ApplicationScope]
    fun provideApiService():ApiService{
        return ApiFactory.apiService
    }

}