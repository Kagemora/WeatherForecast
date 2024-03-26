package com.single.weatherforecast.domain.entities

data class Forecast (
    val currentWeather:Weather,
    val upcoming: List<Weather>
)