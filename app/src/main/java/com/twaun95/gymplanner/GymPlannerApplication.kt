package com.twaun95.gymplanner

import android.app.Application
import com.twaun95.gymplanner.lifecycle.ActivityLifecycleLogger
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import javax.inject.Inject

@HiltAndroidApp
class GymPlannerApplication : Application() {

    @Inject
    lateinit var activityLifecycleLogger: ActivityLifecycleLogger

    override fun onCreate() {
        super.onCreate()

        initLogger()
        registerLifecycleCallbacks()
    }

    private fun initLogger() { Timber.plant(Timber.DebugTree()) }

    private fun registerLifecycleCallbacks() {
        registerActivityLifecycleCallbacks(activityLifecycleLogger)
    }
}