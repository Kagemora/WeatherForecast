package com.single.weatherforecast.data.network.model.current

import com.google.gson.annotations.SerializedName

data class Current(
    @SerializedName("last_updated_epoch")
    val lastUpdatedEpoch: Int,
    @SerializedName("temp_c")
    val tempC: Int,
    @SerializedName("condition")
    val condition: Condition
)
