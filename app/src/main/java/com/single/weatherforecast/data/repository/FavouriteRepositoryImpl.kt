package com.single.weatherforecast.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.single.weatherforecast.data.cache.FavouriteCityDao
import com.single.weatherforecast.data.mapper.toDbModel
import com.single.weatherforecast.data.mapper.toEntities
import com.single.weatherforecast.domain.entities.City
import com.single.weatherforecast.domain.repository.FavouriteRepository
import javax.inject.Inject

class FavouriteRepositoryImpl @Inject constructor(
    private val favouriteCityDao:FavouriteCityDao
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
}