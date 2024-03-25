package com.single.weatherforecast.data.network.api

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiFactory {

    private const val BASE_URL = "http://api.weatherapi.com/v1"

    //Логирование на тестовой сборке, потом на NONE, чтоб фризов не было
    val logging = HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY)

    //Перехват входящих вызовов
    val client = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()

    //Конвертируем json в нестрогом формате
    private val gson = GsonBuilder().setLenient().create()

    //Добавляем HTTP клиент , для чтения и отправки API
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    val apiService = retrofit.create(ApiService::class.java)
}