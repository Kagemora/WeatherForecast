package com.single.weatherforecast.presentation.states

sealed class StateSearchCities() {
    data object Error:StateSearchCities()

    data object Loading:StateSearchCities()


}