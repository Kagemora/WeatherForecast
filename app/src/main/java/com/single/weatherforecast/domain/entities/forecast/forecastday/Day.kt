package com.single.weatherforecast.domain.entities.forecast.forecastday

import com.google.gson.annotations.SerializedName
import com.single.weatherforecast.data.network.model.current.Condition

data class Day(
    val maxtempC: Double?,
    val mintempC: Double?,
    val avgtempC: Double?,
    val totalprecipMm: Double?,
    val condition: Condition?
)
