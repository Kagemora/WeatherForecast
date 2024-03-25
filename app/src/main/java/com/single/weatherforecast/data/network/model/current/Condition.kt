package com.single.weatherforecast.data.network.model.current

import com.google.gson.annotations.SerializedName

data class Condition(
    @SerializedName("text")
    val text: String? = null,
    @SerializedName("icon")
    val icon: String? = null,
    @SerializedName("code")
    val code: Int? = null
)
