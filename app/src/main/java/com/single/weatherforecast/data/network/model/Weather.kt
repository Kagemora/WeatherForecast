package com.single.weatherforecast.data.network.model

import com.google.gson.annotations.SerializedName
import com.single.weatherforecast.data.network.model.current.Current
import com.single.weatherforecast.data.network.model.forecast.Forecast
import com.single.weatherforecast.data.network.model.location.Location

data class Weather(
    @SerializedName("location")
    val location: Location,
    @SerializedName("current")
    val current: Current,
    @SerializedName("forecast")
    val forecast: Forecast
)