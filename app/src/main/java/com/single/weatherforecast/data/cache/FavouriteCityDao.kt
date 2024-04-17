package com.single.weatherforecast.data.cache

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface FavouriteCityDao {

    @Query("SELECT * FROM favourite_city")
    fun getFavouriteCity(): LiveData<CityDbModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addCity(cityDbModel: CityDbModel)

    @Query("DELETE FROM favourite_city WHERE id=:cityId")
    suspend fun deleteCity(cityId: Int)

    @Query("SELECT EXISTS(SELECT *FROM favourite_city WHERE id=:cityId LIMIT 1)")
    fun observeIsCity(cityId: Int): LiveData<Boolean>


}