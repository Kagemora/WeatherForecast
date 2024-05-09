package com.single.weatherforecast.domain.use_case

import com.single.weatherforecast.domain.repository.WeatherRepository
import java.util.Calendar
import javax.inject.Inject
//получение почасового прогноза
class GetHourlyForecastUseCase @Inject constructor(
    private val repository: WeatherRepository
) {
    suspend operator fun invoke(cityId:Int,selectedDate: Calendar) =
        repository.getHourlyForecast(cityId,selectedDate)
}