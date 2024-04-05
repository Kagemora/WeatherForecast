package com.single.weatherforecast.domain.repository


//Поиск городов
interface SearchRepository {
    suspend fun search(query: String): List<String>
}