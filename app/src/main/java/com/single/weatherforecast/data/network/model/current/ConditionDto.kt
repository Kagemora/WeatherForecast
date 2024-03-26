package com.single.weatherforecast.data.network.model.current

import com.google.gson.annotations.SerializedName

data class ConditionDto(
    @SerializedName("text")
    val text: String,
    @SerializedName("icon")
    val iconUrl: String
)
