package com.single.weatherforecast.presentation.view_model

import androidx.lifecycle.ViewModel
import com.single.weatherforecast.domain.use_case.ChangeFavouriteStateUseCase
import com.single.weatherforecast.domain.use_case.GetDailyForecastUseCase
import com.single.weatherforecast.domain.use_case.GetFavouriteCitiesUseCase

class SelectedCitiesViewModel(
    private val getFavouriteCitiesUseCase: GetFavouriteCitiesUseCase,
    private val changeFavouriteStateUseCase: ChangeFavouriteStateUseCase
):ViewModel() {

}