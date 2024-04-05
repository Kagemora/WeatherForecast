package com.single.weatherforecast.domain.repository

import com.single.weatherforecast.domain.entities.DailyForecast
import com.single.weatherforecast.domain.entities.Forecast
import com.single.weatherforecast.domain.entities.HourlyForecast
import com.single.weatherforecast.domain.entities.Weather
import kotlinx.coroutines.flow.Flow

//
interface WeatherRepository {

    suspend fun getWeather(cityId: Int): Weather

    suspend fun getForecast(cityId: Int): Forecast
    fun getHourlyForecast(cityId: Int): Flow<List<HourlyForecast>>
    fun getDailyForecast(cityId: Int): Flow<List<DailyForecast>>
}