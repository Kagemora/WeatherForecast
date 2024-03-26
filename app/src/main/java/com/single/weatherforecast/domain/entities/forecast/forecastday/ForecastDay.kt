package com.single.weatherforecast.domain.entities.forecast.forecastday

data class ForecastDay(
    val date: String?,
    val day: Day?,
    val hour: List<Hour>?
)
