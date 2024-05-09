package com.single.weatherforecast.presentation.view_model

import androidx.lifecycle.ViewModel
import com.single.weatherforecast.domain.use_case.ChangeFavouriteStateUseCase
import com.single.weatherforecast.domain.use_case.GetCurrentWeatherUseCase
import com.single.weatherforecast.domain.use_case.ObserveFavouriteStateUseCase

class CurrentWeatherViewModel(
    private val getCurrentWeatherUseCase: GetCurrentWeatherUseCase,
    private val observeFavouriteStateUseCase: ObserveFavouriteStateUseCase,
    private val changeFavouriteStateUseCase: ChangeFavouriteStateUseCase
):ViewModel() {

}