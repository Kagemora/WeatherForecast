package com.single.weatherforecast.domain.entities

data class HourlyForecast (
    val time:Long,
    val condition:String,
    val conditionUrl: String,
    val tempC:Double
)