package com.single.weatherforecast.data.repository

import com.single.weatherforecast.domain.repository.SearchRepository

class SearchRepositoryImpl : SearchRepository {
    override suspend fun search(query: String): List<String> {
        TODO("Not yet implemented")
    }
}