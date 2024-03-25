package com.single.weatherforecast.domain.entities

import com.google.gson.annotations.SerializedName
import com.single.weatherforecast.data.network.model.current.Current
import com.single.weatherforecast.data.network.model.forecast.Forecast
import com.single.weatherforecast.data.network.model.location.Location

data class Weather (
    val location : Location?,
    val current  : Current?,
    val forecast : Forecast?
)