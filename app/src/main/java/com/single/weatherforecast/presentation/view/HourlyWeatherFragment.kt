package com.single.weatherforecast.presentation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.single.weatherforecast.R


class HourlyWeatherFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_hourly_weather, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) {

        }
    }
}