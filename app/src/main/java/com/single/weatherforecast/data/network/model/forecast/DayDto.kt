package com.single.weatherforecast.data.network.model.forecast

import com.google.gson.annotations.SerializedName

data class DayDto(

    @SerializedName("date_epoch")
    val date: Long,
    @SerializedName("day")
    val day: DayWeatherDto,
    @SerializedName("hour")
    val hour: List<Hour>
)
