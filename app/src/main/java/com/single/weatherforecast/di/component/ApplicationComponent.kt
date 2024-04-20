package com.single.weatherforecast.di.component

import android.content.Context
import com.single.weatherforecast.di.anotation.ApplicationScope
import com.single.weatherforecast.di.module.DataModule
import com.single.weatherforecast.di.module.DomainModule
import dagger.BindsInstance
import dagger.Component


@[Component(
    modules = [
        DomainModule::class,
        DataModule::class
    ]
)
ApplicationScope]
interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context
        ): ApplicationComponent
    }
}