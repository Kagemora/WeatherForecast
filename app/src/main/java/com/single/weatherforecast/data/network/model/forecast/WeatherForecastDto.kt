package com.single.weatherforecast.data.network.model.forecast

import com.google.gson.annotations.SerializedName
import com.single.weatherforecast.data.network.model.current.WeatherDto

data class WeatherForecastDto(
    @SerializedName("current")
    val current: WeatherDto,
    @SerializedName("forecast")
    val weatherForecastDayDto: WeatherForecastDayDto
)
