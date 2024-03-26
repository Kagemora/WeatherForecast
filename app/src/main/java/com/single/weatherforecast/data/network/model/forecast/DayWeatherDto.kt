package com.single.weatherforecast.data.network.model.forecast

import com.google.gson.annotations.SerializedName
import com.single.weatherforecast.data.network.model.current.ConditionDto

data class DayWeatherDto(
    @SerializedName("avgtemp_c")
    val avgtempC: Double,
    @SerializedName("totalprecip_mm")
    val totalprecipMm: Double,
    @SerializedName("condition")
    val conditionDto: ConditionDto
)
