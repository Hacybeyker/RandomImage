package com.hacybeyker.randomimage

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by Carlos Osorio on 19/03/2021
 */

@HiltAndroidApp
class ApplicationBase : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}