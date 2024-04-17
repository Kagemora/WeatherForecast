package com.single.weatherforecast.data.mapper

import com.single.weatherforecast.data.network.model.city_search.CityDto
import com.single.weatherforecast.domain.entities.City

fun CityDto.toEntity(): City = City(id, name, country)

fun List<CityDto>.toEntities(): List<City> = map { it.toEntity() }