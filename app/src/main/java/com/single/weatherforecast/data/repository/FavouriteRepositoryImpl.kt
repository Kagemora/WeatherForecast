package com.single.weatherforecast.data.repository

import androidx.lifecycle.LiveData
import com.single.weatherforecast.data.cache.FavouriteCityDao
import com.single.weatherforecast.domain.entities.City
import com.single.weatherforecast.domain.repository.FavouriteRepository
import javax.inject.Inject

class FavouriteRepositoryImpl @Inject constructor(
    private val favouriteCityDao:FavouriteCityDao
) : FavouriteRepository {
    override fun favouriteCities(): LiveData<List<City>> {
        TODO("Not yet implemented")
    }

    override fun observeIsFavourite(cityId: Int): LiveData<Boolean> {
        TODO("Not yet implemented")
    }

    override suspend fun addToFavourite(city: City) {
        TODO("Not yet implemented")
    }

    override suspend fun removeFromFavourite(city: Int) {
        TODO("Not yet implemented")
    }
}