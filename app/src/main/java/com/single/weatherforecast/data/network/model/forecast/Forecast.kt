package com.single.weatherforecast.data.network.model.forecast

import com.google.gson.annotations.SerializedName
import com.single.weatherforecast.data.network.model.forecast.forecastday.ForecastDay

data class Forecast(
    @SerializedName("forecastday")
    val forecastday: List<ForecastDay>
)
