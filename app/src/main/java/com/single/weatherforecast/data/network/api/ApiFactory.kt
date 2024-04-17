package com.single.weatherforecast.data.network.api

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {

    val logging = HttpLoggingInterceptor()                     //Логирование на тестовой сборке, потом на NONE, чтоб фризов не было
        .setLevel(HttpLoggingInterceptor.Level.NONE)


    val clientOkHttpClient = OkHttpClient.Builder()            //Перехват входящих вызовов
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


    private val gson = GsonBuilder().setLenient().create()    //Конвертируем json в нестрогом формате


    private val retrofit = Retrofit.Builder()                 //Добавляем HTTP клиент , для чтения и отправки API
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(clientOkHttpClient)
        .build()

    val apiService = retrofit.create(ApiService::class.java)
}

private const val BASE_URL = "https://api.weatherapi.com/v1/"
private const val KEY_NAME = "key"
private const val KEY_VALUE= "2acefc9d1e244226822111750242503"