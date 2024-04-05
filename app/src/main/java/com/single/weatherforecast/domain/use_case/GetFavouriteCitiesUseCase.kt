package com.single.weatherforecast.domain.use_case

import com.single.weatherforecast.domain.repository.FavouriteRepository
import javax.inject.Inject

class GetFavouriteCitiesUseCase @Inject constructor(
    private val repository: FavouriteRepository
){
    operator fun invoke() = repository.favouriteCities()
}