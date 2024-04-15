package com.single.weatherforecast.domain.repository

import androidx.lifecycle.LiveData
import com.single.weatherforecast.domain.entities.DailyForecast
import com.single.weatherforecast.domain.entities.Forecast
import com.single.weatherforecast.domain.entities.HourlyForecast
import com.single.weatherforecast.domain.entities.Weather

//Показывает погоду
interface WeatherRepository {

    suspend fun getWeather(cityId: Int): Weather

    suspend fun getForecast(cityId: Int): Forecast
    suspend fun getHourlyForecast(cityId: Int): List<HourlyForecast>
    suspend fun getDailyForecast(cityId: Int): List<DailyForecast>
}