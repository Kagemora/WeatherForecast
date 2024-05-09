package com.single.weatherforecast.data.repository

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import androidx.work.ExistingWorkPolicy
import androidx.work.WorkManager
import com.single.weatherforecast.data.cache.FavouriteCityDao
import com.single.weatherforecast.data.mapper.toDbModel
import com.single.weatherforecast.data.mapper.toEntities
import com.single.weatherforecast.data.workers.RefreshDataWorker
import com.single.weatherforecast.domain.entities.City
import com.single.weatherforecast.domain.repository.FavouriteRepository
import javax.inject.Inject

class FavouriteRepositoryImpl @Inject constructor(
    private val favouriteCityDao:FavouriteCityDao,
    private val context: Context
) : FavouriteRepository {
    override fun favouriteCities(): LiveData<List<City>> {
        return favouriteCityDao.getFavouriteCity().map { it.toEntities() }
    }

    override fun observeIsFavourite(cityId: Int): LiveData<Boolean> {
        return favouriteCityDao.observeIsCity(cityId)
    }

    override suspend fun addToFavourite(city: City) {
        return favouriteCityDao.addCity(city.toDbModel())
    }

    override suspend fun removeFromFavourite(city: Int) {
        return favouriteCityDao.deleteCity(city)
    }

    override fun loadData() {
        val workManager = WorkManager.getInstance(context.applicationContext)
        workManager.enqueueUniqueWork(
            RefreshDataWorker.NAME,
            ExistingWorkPolicy.REPLACE,
            RefreshDataWorker.makeRequest()
        )
    }
}