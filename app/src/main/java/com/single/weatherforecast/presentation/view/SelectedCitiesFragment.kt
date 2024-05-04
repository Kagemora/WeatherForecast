package com.single.weatherforecast.presentation.view

import android.Manifest
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import com.single.weatherforecast.R
import com.single.weatherforecast.presentation.utils.isPermissionGranted


class SelectedCitiesFragment : Fragment() {
    private lateinit var pLauncher: ActivityResultLauncher<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_selected_cities, container, false)
    }

    private fun permissionListener(){
        pLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()){
            Toast.makeText(activity,"Permission is $it",Toast.LENGTH_SHORT).show()
        }
    }
    private fun checkPermission(){
        if (!isPermissionGranted(Manifest.permission.ACCESS_FINE_LOCATION)){
            permissionListener()
            pLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
        }
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String){

        }
    }
}