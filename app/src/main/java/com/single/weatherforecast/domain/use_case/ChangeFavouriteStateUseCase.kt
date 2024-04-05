package com.single.weatherforecast.domain.use_case

import com.single.weatherforecast.domain.entities.City
import com.single.weatherforecast.domain.repository.FavouriteRepository
import javax.inject.Inject
//Добавление/удаление городов
class ChangeFavouriteStateUseCase @Inject constructor(
    private val repository: FavouriteRepository
) {
    suspend fun addToFavourite(city: City) = repository.addToFavourite(city)
    suspend fun removeFromFavourite(cityId: Int) = repository.removeFromFavourite(cityId)

}