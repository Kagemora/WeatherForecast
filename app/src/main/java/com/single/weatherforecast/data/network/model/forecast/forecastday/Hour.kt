package com.single.weatherforecast.data.network.model.forecast.forecastday

import com.google.gson.annotations.SerializedName
import com.single.weatherforecast.data.network.model.current.Condition

data class Hour(
    @SerializedName("time")
    val time: String? = null,
    @SerializedName("temp_c")
    val tempC: Double? = null,
    @SerializedName("condition")
    val condition: Condition? = null
)
