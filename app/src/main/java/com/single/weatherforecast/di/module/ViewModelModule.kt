package com.single.weatherforecast.di.module

import androidx.lifecycle.ViewModel
import com.single.weatherforecast.di.anotation.ViewModelKey
import com.single.weatherforecast.presentation.view_model.CurrentWeatherViewModel
import com.single.weatherforecast.presentation.view_model.HourlyWeatherViewModel
import com.single.weatherforecast.presentation.view_model.SearchCitiesViewModel
import com.single.weatherforecast.presentation.view_model.SelectedCitiesViewModel
import com.single.weatherforecast.presentation.view_model.WeatherByDayViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(CurrentWeatherViewModel::class)
    fun bindCurrentWeatherViewModel(viewModel: CurrentWeatherViewModel): ViewModel
    @Binds
    @IntoMap
    @ViewModelKey(HourlyWeatherViewModel::class)
    fun bindHourlyWeatherViewModel(viewModel: HourlyWeatherViewModel): ViewModel
    @Binds
    @IntoMap
    @ViewModelKey(SelectedCitiesViewModel::class)
    fun bindSelectedCitiesViewModel(viewModel: SelectedCitiesViewModel): ViewModel
    @Binds
    @IntoMap
    @ViewModelKey(WeatherByDayViewModel::class)
    fun bindWeatherByDayViewModel(viewModel: WeatherByDayViewModel): ViewModel
    @Binds
    @IntoMap
    @ViewModelKey(SearchCitiesViewModel::class)
    fun bindSearchCitiesViewModel(viewModel: SearchCitiesViewModel): ViewModel

}