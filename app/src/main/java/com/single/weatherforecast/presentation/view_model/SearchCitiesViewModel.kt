package com.single.weatherforecast.presentation.view_model

import androidx.lifecycle.ViewModel
import com.single.weatherforecast.domain.use_case.ChangeFavouriteStateUseCase
import com.single.weatherforecast.domain.use_case.GetFavouriteCitiesUseCase
import com.single.weatherforecast.domain.use_case.SearchCityUseCase
import javax.inject.Inject

class SearchCitiesViewModel @Inject constructor(
    private val searchCityUseCase: SearchCityUseCase
):ViewModel() {





}