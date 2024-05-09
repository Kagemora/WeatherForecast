package com.single.weatherforecast.presentation.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory

class FragmentFactory : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return super.instantiate(classLoader, className)
    }

}