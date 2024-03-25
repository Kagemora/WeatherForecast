package com.single.weatherforecast.domain.entities.forecast.forecastday

import com.google.gson.annotations.SerializedName

data class ForecastDay(
    val date: String?,
    val day: Day?,
    val hour: List<Hour>?
)
