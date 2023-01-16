package com.twaun95.gymplanner

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class GymPlannerApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        initLogger()
    }

    private fun initLogger() { Timber.plant(Timber.DebugTree()) }
}