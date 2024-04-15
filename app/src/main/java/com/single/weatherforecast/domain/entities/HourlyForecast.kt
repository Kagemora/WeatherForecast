package com.single.weatherforecast.domain.entities

import java.util.Calendar

data class HourlyForecast (
     val time: Calendar,
     val condition: String,
     val conditionUrl: String,
     val tempC: Double
)