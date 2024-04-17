package com.single.weatherforecast.domain.repository

import com.single.weatherforecast.domain.entities.City


//Поиск городов
interface SearchRepository {
    suspend fun search(query: String): List<City>
}