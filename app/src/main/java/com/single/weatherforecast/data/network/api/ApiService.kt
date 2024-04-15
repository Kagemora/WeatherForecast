package com.single.weatherforecast.data.network.api


import com.single.weatherforecast.data.network.model.city_search.CityDto
import com.single.weatherforecast.data.network.model.current.WeatherCurrentDto
import com.single.weatherforecast.data.network.model.forecast.WeatherForecastDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(CURRENT_JSON)
    suspend fun loadCurrentWeather(
        @Query("q") query: String
    ): WeatherCurrentDto


    @GET(FORECAST_JSON)
    suspend fun loadForecast(
        @Query("q") query: String,
        @Query("days") int: Int = 4
    ): WeatherForecastDto


    @GET(SEARCH_JSON)
    suspend fun loadCity(
        @Query("q") query: String
    ):List<CityDto>

}

private const val CURRENT_JSON = "current.json"
private const val FORECAST_JSON = "forecast.json"
private const val SEARCH_JSON = "search.json"