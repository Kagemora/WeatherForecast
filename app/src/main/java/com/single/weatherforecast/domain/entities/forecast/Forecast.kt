package com.single.weatherforecast.domain.entities.forecast

import com.single.weatherforecast.data.network.model.forecast.forecastday.ForecastDay

data class Forecast(
    val forecastday : List<ForecastDay>?
)
