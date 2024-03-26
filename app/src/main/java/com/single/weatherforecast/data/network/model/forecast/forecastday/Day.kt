package com.single.weatherforecast.data.network.model.forecast.forecastday

import com.google.gson.annotations.SerializedName
import com.single.weatherforecast.data.network.model.current.Condition

data class Day(
    @SerializedName("maxtemp_c")
    val maxtempC: Double,
    @SerializedName("mintemp_c")
    val mintempC: Double,
    @SerializedName("avgtemp_c")
    val avgtempC: Double,
    @SerializedName("totalprecip_mm")
    val totalprecipMm: Double,
    @SerializedName("condition")
    val condition: Condition
)
