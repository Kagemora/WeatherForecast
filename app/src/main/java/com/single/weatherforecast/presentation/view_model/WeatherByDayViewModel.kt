package com.single.weatherforecast.presentation.view_model

import androidx.lifecycle.ViewModel
import com.single.weatherforecast.domain.use_case.GetDailyForecastUseCase

class WeatherByDayViewModel(
    private val getDailyForecastUseCase: GetDailyForecastUseCase
):ViewModel() {
}