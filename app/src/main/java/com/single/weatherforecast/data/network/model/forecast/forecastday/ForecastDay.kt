package com.single.weatherforecast.data.network.model.forecast.forecastday

import com.google.gson.annotations.SerializedName

data class ForecastDay(

    @SerializedName("date")
    val date: String,
    @SerializedName("day")
    val day: Day,
    @SerializedName("hour")
    val hour: List<Hour>
)
