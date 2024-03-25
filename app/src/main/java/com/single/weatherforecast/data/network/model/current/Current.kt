package com.single.weatherforecast.data.network.model.current

import com.google.gson.annotations.SerializedName

data class Current(
    @SerializedName("last_updated_epoch")
    val lastUpdatedEpoch: Int? = null,
    @SerializedName("temp_c")
    val tempC: Int? = null,
    @SerializedName("condition")
    val condition: Condition? = null
)
