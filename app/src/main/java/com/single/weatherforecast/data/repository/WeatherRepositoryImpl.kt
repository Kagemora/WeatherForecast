package com.single.weatherforecast.data.repository

import com.single.weatherforecast.domain.entities.DailyForecast
import com.single.weatherforecast.domain.entities.Forecast
import com.single.weatherforecast.domain.entities.HourlyForecast
import com.single.weatherforecast.domain.entities.Weather
import com.single.weatherforecast.domain.repository.WeatherRepository

class WeatherRepositoryImpl : WeatherRepository {
    override suspend fun getWeather(cityId: Int): Weather {
        TODO("Not yet implemented")
    }

    override suspend fun getForecast(cityId: Int): Forecast {
        TODO("Not yet implemented")
    }

    override suspend fun getHourlyForecast(cityId: Int): List<HourlyForecast> {
        TODO("Not yet implemented")
    }

    override suspend fun getDailyForecast(cityId: Int): List<DailyForecast> {
        TODO("Not yet implemented")
    }
}