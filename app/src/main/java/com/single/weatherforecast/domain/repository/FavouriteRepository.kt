package com.single.weatherforecast.domain.repository

import androidx.lifecycle.LiveData
import com.single.weatherforecast.domain.entities.City
import kotlinx.coroutines.flow.Flow

//Избранные города
interface FavouriteRepository {
    fun favouriteCities(): LiveData<List<City>>
    fun observeIsFavourite(cityId: Int): LiveData<Boolean>
    suspend fun addToFavourite(city: City)
    suspend fun removeFromFavourite(city: Int)
}