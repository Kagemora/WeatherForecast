package com.single.weatherforecast.domain.entities.current

import com.google.gson.annotations.SerializedName

data class Current(
    val lastUpdatedEpoch: Int?,
    val tempC: Int?,
    val condition: Condition?
)
