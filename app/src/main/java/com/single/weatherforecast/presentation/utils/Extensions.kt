package com.single.weatherforecast.presentation.utils

import android.app.Activity
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

fun Activity.isPermissionGranted(permission: String): Boolean {
    return ContextCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED
}

fun Fragment.isPermissionGranted(p: String): Boolean {
    val context = context
    return context?.let {
        ContextCompat.checkSelfPermission(
            it,p
        ) == PackageManager.PERMISSION_GRANTED
    } ?:false
}