package com.single.weatherforecast.domain.use_case

import com.single.weatherforecast.domain.repository.SearchRepository
import javax.inject.Inject
//поиск города
class SearchCityUseCase @Inject constructor(
    private val repository: SearchRepository
) {
    suspend operator fun invoke(query: String) = repository.search(query)
}