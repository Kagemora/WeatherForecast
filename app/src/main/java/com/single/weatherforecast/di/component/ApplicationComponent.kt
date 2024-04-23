package com.single.weatherforecast.di.component

import android.content.Context
import com.single.weatherforecast.di.anotation.ApplicationScope
import com.single.weatherforecast.di.module.DataModule
import com.single.weatherforecast.di.module.DomainModule
import com.single.weatherforecast.di.module.ViewModelModule
import com.single.weatherforecast.di.module.WorkerModule
import com.single.weatherforecast.presentation.app.WeatherApp
import dagger.BindsInstance
import dagger.Component


@[Component(
    modules = [
        DomainModule::class,
        DataModule::class,
        ViewModelModule::class,
        WorkerModule::class
    ]
)
ApplicationScope]
interface ApplicationComponent {
    fun inject(weatherApp: WeatherApp)

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context,
        ): ApplicationComponent
    }
}