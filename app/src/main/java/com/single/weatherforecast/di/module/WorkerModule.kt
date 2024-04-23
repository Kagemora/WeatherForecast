package com.single.weatherforecast.di.module

import androidx.work.ListenableWorker
import com.single.weatherforecast.data.workers.ChildWorkerFactory
import com.single.weatherforecast.data.workers.RefreshDataWorker
import com.single.weatherforecast.di.anotation.WorkerKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface WorkerModule {
    @Binds
    @IntoMap
    @WorkerKey(RefreshDataWorker::class)
    fun bindRefreshDataWorkerFactory(refreshDataWorker: RefreshDataWorker.Factory):ChildWorkerFactory
}