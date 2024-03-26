package com.single.weatherforecast.data.network.model.location

import com.google.gson.annotations.SerializedName

data class LocationDto(
    @SerializedName("location")
    val location: CountryDto
)
