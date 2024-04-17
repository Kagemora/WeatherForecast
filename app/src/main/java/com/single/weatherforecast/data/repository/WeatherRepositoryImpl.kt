package com.single.weatherforecast.data.repository

import com.single.weatherforecast.data.mapper.getHourlyForecastsForDate
import com.single.weatherforecast.data.mapper.toEntity
import com.single.weatherforecast.data.mapper.toEntityDailyForecast
import com.single.weatherforecast.data.network.api.ApiService
import com.single.weatherforecast.domain.entities.DailyForecast
import com.single.weatherforecast.domain.entities.Forecast
import com.single.weatherforecast.domain.entities.HourlyForecast
import com.single.weatherforecast.domain.entities.Weather
import com.single.weatherforecast.domain.repository.WeatherRepository
import java.util.Calendar
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : WeatherRepository {
    override suspend fun getWeather(cityId: Int): Weather {
        return apiService.loadCurrentWeather("$PREFIX_CITY_ID$cityId").toEntity()
    }

    override suspend fun getForecast(cityId: Int): Forecast {
        return apiService.loadForecast("$PREFIX_CITY_ID$cityId").toEntity()
    }

    override suspend fun getHourlyForecast(cityId: Int,selectedDate: Calendar): List<HourlyForecast> {
        return apiService.loadForecast("$PREFIX_CITY_ID$cityId").getHourlyForecastsForDate(selectedDate)
    }

    override suspend fun getDailyForecast(cityId: Int): List<DailyForecast> {
        return apiService.loadForecast("$PREFIX_CITY_ID$cityId").toEntityDailyForecast()
    }
}

private const val PREFIX_CITY_ID = "id:"