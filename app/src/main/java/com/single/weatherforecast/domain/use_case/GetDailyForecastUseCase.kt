package com.single.weatherforecast.domain.use_case

import com.single.weatherforecast.domain.repository.WeatherRepository
import javax.inject.Inject

class GetDailyForecastUseCase @Inject constructor(
    private val repository: WeatherRepository
) {
    operator fun invoke(cityId:Int) = repository.getDailyForecast(cityId)
}