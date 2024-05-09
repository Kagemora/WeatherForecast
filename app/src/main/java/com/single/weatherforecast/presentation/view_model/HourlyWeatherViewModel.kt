package com.single.weatherforecast.presentation.view_model

import androidx.lifecycle.ViewModel
import com.single.weatherforecast.domain.use_case.GetHourlyForecastUseCase

class HourlyWeatherViewModel (
    private val getHourlyForecastUseCase: GetHourlyForecastUseCase
):ViewModel() {

}