package com.single.weatherforecast.data.network.model.city_search

import com.google.gson.annotations.SerializedName

data class CityDto(
    @SerializedName("id")
    var id: Int,
    @SerializedName("name")
    var name: String,
    @SerializedName("country")
    var country: String,
)
