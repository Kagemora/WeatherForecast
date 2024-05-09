package com.single.weatherforecast.domain.use_case

import com.single.weatherforecast.domain.repository.WeatherRepository
import javax.inject.Inject
//получение текущего прогноза погоды
class GetCurrentWeatherUseCase @Inject constructor(
    private val repository: WeatherRepository
) {
    suspend operator fun invoke(cityId: Int) = repository.getWeather(cityId)
}