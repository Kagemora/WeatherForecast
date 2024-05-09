package com.single.weatherforecast.data.mapper


import com.single.weatherforecast.data.network.model.current.WeatherCurrentDto
import com.single.weatherforecast.data.network.model.current.WeatherDto
import com.single.weatherforecast.data.network.model.forecast.Hour
import com.single.weatherforecast.data.network.model.forecast.WeatherForecastDto
import com.single.weatherforecast.domain.entities.DailyForecast
import com.single.weatherforecast.domain.entities.Forecast
import com.single.weatherforecast.domain.entities.HourlyForecast
import com.single.weatherforecast.domain.entities.Weather
import java.util.Calendar
import java.util.Date


fun WeatherCurrentDto.toEntity(): Weather = weatherDto.toEntity()

fun WeatherDto.toEntity(): Weather = Weather(
    tempC = tempC,
    condition = conditionDto.text,
    conditionUrl = conditionDto.iconUrl.correctImageUrl(),
    time = lastUpdatedEpoch.toCalendar()
)
fun WeatherForecastDto.toEntityDailyForecast(): List<DailyForecast> =
    weatherForecastDayDto.forecastday.map {
        DailyForecast(
            time = it.date.toCalendar(),
            condition = it.day.conditionDto.text,
            conditionUrl = it.day.conditionDto.iconUrl.correctImageUrl(),
            tempC = it.day.avgtempC
        )
    }

fun WeatherForecastDto.getHourlyForecastsForDate(selectedDate: Calendar): List<HourlyForecast> {
    return weatherForecastDayDto.forecastday.find {
        val forecastDate = it.date.toCalendar()
        forecastDate.get(Calendar.YEAR) == selectedDate.get(Calendar.YEAR) &&
                forecastDate.get(Calendar.DAY_OF_YEAR) == selectedDate.get(Calendar.DAY_OF_YEAR)
    }?.hour?.map {
        HourlyForecast(
            time = it.time.toCalendar(),
            condition = it.conditionDto.text,
            conditionUrl = it.conditionDto.iconUrl.correctImageUrl(),
            tempC = it.tempC
        )
    } ?: emptyList()
}

fun WeatherForecastDto.toEntity(): Forecast = Forecast(
    currentWeather = current.toEntity(),
    upcomingHourly = weatherForecastDayDto.forecastday.first().hour.map { hourDto ->
        HourlyForecast(
            time = hourDto.time.toCalendar(),
            tempC = hourDto.tempC,
            condition = hourDto.conditionDto.text,
            conditionUrl = hourDto.conditionDto.iconUrl.correctImageUrl()
        )
    },
    upcomingDaily = weatherForecastDayDto.forecastday.drop(1).map {
        val dayWeatherDto = it.day
        DailyForecast(
            tempC = dayWeatherDto.avgtempC,
            condition = dayWeatherDto.conditionDto.text,
            conditionUrl = dayWeatherDto.conditionDto.iconUrl.correctImageUrl(),
            time = it.date.toCalendar()
        )
    }
)


private fun Long.toCalendar(): Calendar = Calendar.getInstance().apply {
    time = Date(this@toCalendar * 1000)
}

private fun String.correctImageUrl(): String = "https:$this".replace(
    oldValue = "64x64",
    newValue = "128x128"
)