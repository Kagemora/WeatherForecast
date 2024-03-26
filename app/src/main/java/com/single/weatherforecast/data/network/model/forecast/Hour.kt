package com.single.weatherforecast.data.network.model.forecast

import com.google.gson.annotations.SerializedName
import com.single.weatherforecast.data.network.model.current.ConditionDto

data class Hour(
    @SerializedName("time_epoch")
    val time: Long,
    @SerializedName("temp_c")
    val tempC: Double,
    @SerializedName("condition")
    val conditionDto: ConditionDto
)
