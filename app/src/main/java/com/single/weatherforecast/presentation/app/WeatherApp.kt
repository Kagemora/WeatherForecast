package com.single.weatherforecast.presentation.app

import android.app.Application
import com.single.weatherforecast.di.component.ApplicationComponent
import com.single.weatherforecast.di.component.DaggerApplicationComponent

class WeatherApp : Application() {
    lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()

    }
}