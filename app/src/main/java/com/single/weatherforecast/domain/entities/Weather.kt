package com.single.weatherforecast.domain.entities

import java.util.Calendar
import java.util.Date
import java.util.concurrent.locks.Condition

data class Weather(
     val time: Calendar,
     val condition: String,
     val conditionUrl: String,
     val tempC: Double
)
