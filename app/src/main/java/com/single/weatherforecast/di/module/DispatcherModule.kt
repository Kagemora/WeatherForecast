package com.single.weatherforecast.di.module

import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

@Module
object DispatcherModule {
    @Provides
    fun provideIoDispatcher(): CoroutineDispatcher = Dispatchers.IO
}