package com.single.weatherforecast.data.repository

import com.single.weatherforecast.domain.repository.SearchRepository
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(

): SearchRepository {
    override suspend fun search(query: String): List<String> {
        TODO("Not yet implemented")
    }
}