package com.single.weatherforecast.data.mapper

import com.single.weatherforecast.data.cache.CityDbModel
import com.single.weatherforecast.domain.entities.City

fun City.toDbModel():CityDbModel = CityDbModel(id, name, country)

fun CityDbModel.toEntity():City = City(id, name, country)

fun List<CityDbModel>.toEntities():List<City> = map {
    it.toEntity()
}

