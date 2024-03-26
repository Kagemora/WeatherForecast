package com.single.weatherforecast.data.network.model.current

import com.google.gson.annotations.SerializedName

data class WeatherDto(
    @SerializedName("last_updated_epoch")
    val lastUpdatedEpoch: Long,
    @SerializedName("temp_c")
    val tempC: Double,
    @SerializedName("condition")
    val conditionDto: ConditionDto
)
