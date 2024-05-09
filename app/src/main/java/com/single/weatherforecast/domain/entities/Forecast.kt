package com.single.weatherforecast.domain.entities

data class Forecast (
    val currentWeather:Weather,
    val upcomingHourly: List<HourlyForecast>,
    val upcomingDaily: List<DailyForecast>
)