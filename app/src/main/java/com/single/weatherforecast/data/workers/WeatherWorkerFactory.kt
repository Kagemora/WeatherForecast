package com.single.weatherforecast.data.workers

import android.content.Context
import androidx.work.ListenableWorker
import androidx.work.WorkerFactory
import androidx.work.WorkerParameters
import javax.inject.Inject
import javax.inject.Provider
import kotlin.reflect.KClass

class WeatherWorkerFactory @Inject constructor(
    private val workerProvides: @JvmSuppressWildcards Map<Class<out ListenableWorker>, Provider<ChildWorkerFactory>>
):WorkerFactory() {
    override fun createWorker(
        appContext: Context,
        workerClassName: String,
        workerParameters: WorkerParameters
    ): ListenableWorker? {
        return when(workerClassName){
            RefreshDataWorker::class.qualifiedName->{
                val worker = workerProvides[RefreshDataWorker::class.java]?.get()
                return worker?.create(appContext,workerParameters)
            }
            else -> null
        }
    }
}