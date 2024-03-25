package com.single.weatherforecast.domain.entities.forecast.forecastday

import com.google.gson.annotations.SerializedName
import com.single.weatherforecast.data.network.model.current.Condition

data class Hour(
    val time: String?,
    val tempC: Double?,
    val condition: Condition?
)
