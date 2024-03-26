package com.single.weatherforecast.domain.entities.current

data class Current(
    val lastUpdatedEpoch: Int?,
    val tempC: Int?,
    val condition: Condition?
)
