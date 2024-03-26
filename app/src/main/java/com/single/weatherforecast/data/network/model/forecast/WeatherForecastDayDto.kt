package com.single.weatherforecast.data.network.model.forecast

import com.google.gson.annotations.SerializedName

data class WeatherForecastDayDto(
    @SerializedName("forecastday")
    val forecastday: List<DayDto>

)
