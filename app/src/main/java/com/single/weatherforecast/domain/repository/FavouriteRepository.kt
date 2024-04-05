package com.single.weatherforecast.domain.repository

import com.single.weatherforecast.domain.entities.City
import kotlinx.coroutines.flow.Flow

//Избранные города
interface FavouriteRepository {
    fun favouriteCities(): Flow<List<City>>
    fun observeIsFavourite(cityId: Int): Flow<Boolean>
    suspend fun addToFavourite(city: City)
    suspend fun removeFromFavourite(city: Int)
}