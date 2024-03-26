package com.single.weatherforecast.data.network.model.forecast.forecastday

import com.google.gson.annotations.SerializedName
import com.single.weatherforecast.data.network.model.current.Condition

data class Hour(
    @SerializedName("time")
    val time: String,
    @SerializedName("temp_c")
    val tempC: Double,
    @SerializedName("condition")
    val condition: Condition
)
