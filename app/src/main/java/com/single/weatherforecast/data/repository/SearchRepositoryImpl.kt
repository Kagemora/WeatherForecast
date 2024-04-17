package com.single.weatherforecast.data.repository

import com.single.weatherforecast.data.mapper.toEntities
import com.single.weatherforecast.data.network.api.ApiService
import com.single.weatherforecast.domain.entities.City
import com.single.weatherforecast.domain.repository.SearchRepository
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val apiService: ApiService
): SearchRepository {
    override suspend fun search(query: String): List<City> {
        return apiService.loadCity(query).toEntities()
    }
}