package com.single.weatherforecast.domain.entities.current

import com.google.gson.annotations.SerializedName

data class Condition(
    val text: String?,
    val icon: String?,
    val code: Int?
)
