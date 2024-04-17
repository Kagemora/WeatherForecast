package com.single.weatherforecast.data.mapper

import com.single.weatherforecast.data.network.model.current.WeatherCurrentDto
import com.single.weatherforecast.data.network.model.current.WeatherDto
import com.single.weatherforecast.data.network.model.forecast.DayDto
import com.single.weatherforecast.data.network.model.forecast.Hour
import com.single.weatherforecast.data.network.model.forecast.WeatherForecastDto
import com.single.weatherforecast.domain.entities.DailyForecast
import com.single.weatherforecast.domain.entities.Forecast
import com.single.weatherforecast.domain.entities.HourlyForecast
import com.single.weatherforecast.domain.entities.Weather
import java.util.Calendar
import java.util.Date


fun WeatherCurrentDto.toEntity():Weather = weatherDto.toEntity()

fun WeatherDto.toEntity():Weather = Weather(
    tempC = tempC,
    condition = conditionDto.text,
    conditionUrl = conditionDto.iconUrl.correctImageUrl(),
    time = lastUpdatedEpoch.toCalendar()
)

fun DayDto.toEntity():DailyForecast = DailyForecast(
    time = date.toCalendar(),
    condition = day.conditionDto.text,
    conditionUrl = day.conditionDto.iconUrl.correctImageUrl(),
    tempC = day.avgtempC
)

fun Hour.toEntity():HourlyForecast = HourlyForecast(
    time = time.toCalendar(),
    tempC =  tempC,
    conditionUrl = conditionDto.iconUrl.correctImageUrl(),
    condition = conditionDto.text
)

fun WeatherForecastDto.toEntity():Forecast = Forecast(
    currentWeather = current.toEntity(),
    upcoming = weatherForecastDayDto.forecastday.drop(1).map {
        val dayWeatherDto = it.day
        Weather(
            tempC = dayWeatherDto.avgtempC,
            condition = dayWeatherDto.conditionDto.text,
            conditionUrl = dayWeatherDto.conditionDto.iconUrl.correctImageUrl(),
            time = it.date.toCalendar()
        )
    }
)


private fun Long.toCalendar():Calendar = Calendar.getInstance().apply {
    time = Date(this@toCalendar*1000)
}

private fun String.correctImageUrl():String = "https:$this".replace(
    oldValue = "64x64",
    newValue = "128x128"
)