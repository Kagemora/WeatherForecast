package com.single.weatherforecast.data.workers

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.ListenableWorker
import androidx.work.WorkerParameters
import com.single.weatherforecast.data.cache.AppDatabase
import com.single.weatherforecast.data.network.api.ApiService
import javax.inject.Inject

class RefreshDataWorker(
    appContext: Context,
    params: WorkerParameters,
    private val apiService: ApiService,
    private val appDatabase: AppDatabase
) : CoroutineWorker(appContext, params) {
    override suspend fun doWork(): Result {
        TODO("Not yet implemented")
    }

    class Factory @Inject constructor(
        private val apiService: ApiService,
        private val appDatabase: AppDatabase
    ):ChildWorkerFactory{
        override fun create(
            context: Context,
            workerParameters: WorkerParameters
        ): ListenableWorker {
            return RefreshDataWorker(
                context,
                workerParameters,
                apiService,
                appDatabase
            )
        }

    }
}