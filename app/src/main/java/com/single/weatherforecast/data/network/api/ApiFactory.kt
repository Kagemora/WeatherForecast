package com.single.weatherforecast.data.network.api

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {
    //Логирование на тестовой сборке, потом на NONE, чтоб фризов не было
    val logging = HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY)

    //Перехват входящих вызовов
    val clientOkHttpClient = OkHttpClient.Builder()
        .addInterceptor(logging)
        .addInterceptor{ chain ->
            val originalRequest = chain.request()
            val newUrl = originalRequest
                .url
                .newBuilder()
                .addQueryParameter(KEY_NAME, KEY_VALUE)
                .build()
            val newRequest = originalRequest.newBuilder()
                .url(newUrl)
                .build()
            chain.proceed(newRequest)
        }
        .build()
//
    //Конвертируем json в нестрогом формате
    private val gson = GsonBuilder().setLenient().create()

    //Добавляем HTTP клиент , для чтения и отправки API
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(clientOkHttpClient)
        .build()

    val apiService = retrofit.create(ApiService::class.java)
}

private const val BASE_URL = "https://api.weatherapi.com/v1/"
private const val KEY_NAME = "key"
private const val KEY_VALUE= "2acefc9d1e244226822111750242503"