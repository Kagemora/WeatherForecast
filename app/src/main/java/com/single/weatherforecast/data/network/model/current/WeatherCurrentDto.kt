package com.single.weatherforecast.data.network.model.current

import com.google.gson.annotations.SerializedName

data class WeatherCurrentDto(
    @SerializedName("current")
    val weatherDto: WeatherDto
)
