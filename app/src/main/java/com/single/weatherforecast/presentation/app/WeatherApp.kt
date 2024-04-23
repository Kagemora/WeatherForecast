package com.single.weatherforecast.presentation.app

import android.app.Application
import androidx.work.Configuration
import com.single.weatherforecast.data.workers.WeatherWorkerFactory
import com.single.weatherforecast.di.component.DaggerApplicationComponent
import javax.inject.Inject

class WeatherApp : Application(), Configuration.Provider {

    @Inject
    lateinit var workerFactory: WeatherWorkerFactory

    val component by lazy {
        DaggerApplicationComponent.factory().create(applicationContext)
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }

    override val workManagerConfiguration: Configuration
        get() = Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .build()
}