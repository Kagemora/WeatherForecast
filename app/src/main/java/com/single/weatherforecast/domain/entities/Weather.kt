package com.single.weatherforecast.domain.entities

import java.util.Calendar
import java.util.Date
import java.util.concurrent.locks.Condition

data class Weather(
    val tempC: Double,
    val condition: String,
    val conditionUrl: String,
    val date: Calendar
)
