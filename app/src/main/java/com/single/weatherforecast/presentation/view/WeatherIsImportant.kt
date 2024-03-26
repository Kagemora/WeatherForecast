package com.single.weatherforecast.presentation.view

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.single.weatherforecast.R
import com.single.weatherforecast.data.network.api.ApiFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class WeatherIsImportant : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val api = ApiFactory.apiService

        CoroutineScope(Dispatchers.Main).launch {
            val current = api.loadCurrentWeather("London")
            val weather = api.loadForecast("London")
            val we = api.loadCity("London")
            Log.d("WeatherIsImportant", "$current and $weather and2 $we")
        }
    }
}