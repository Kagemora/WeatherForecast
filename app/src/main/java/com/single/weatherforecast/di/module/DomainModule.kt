package com.single.weatherforecast.di.module

import com.single.weatherforecast.data.repository.FavouriteRepositoryImpl
import com.single.weatherforecast.data.repository.SearchRepositoryImpl
import com.single.weatherforecast.data.repository.WeatherRepositoryImpl
import com.single.weatherforecast.di.anotation.ApplicationScope
import com.single.weatherforecast.domain.repository.FavouriteRepository
import com.single.weatherforecast.domain.repository.SearchRepository
import com.single.weatherforecast.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {
    @[Binds
    ApplicationScope]
    fun bindFavouriteRepository(favouriteRepository: FavouriteRepositoryImpl): FavouriteRepository

    @[Binds
    ApplicationScope]
    fun bindSearchRepository(searchRepository: SearchRepositoryImpl): SearchRepository

    @[Binds
    ApplicationScope]
    fun bindWeatherRepository(weatherRepository: WeatherRepositoryImpl): WeatherRepository


}