package com.twaun95.gymplanner.lifecycle

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber
import javax.inject.Inject

class ActivityLifecycleLogger @Inject constructor() : Application.ActivityLifecycleCallbacks {

    private val fragmentLogTracker = FragmentLifecycleLogger()

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        if (activity is AppCompatActivity) {
            activity.supportFragmentManager.registerFragmentLifecycleCallbacks(
                fragmentLogTracker,
                true
            )
        }

        Timber.d("%s--onCreate", activity::class.java.simpleName)
    }

    override fun onActivityStarted(activity: Activity) {
        Timber.d("%s--onStart", activity::class.java.simpleName)
    }

    override fun onActivityResumed(activity: Activity) {
        Timber.d("%s--onResume", activity::class.java.simpleName)
    }

    override fun onActivityPaused(activity: Activity) {
        Timber.d("%s--onPause", activity::class.java.simpleName)
    }

    override fun onActivityStopped(activity: Activity) {
        Timber.d("%s--onStop", activity::class.java.simpleName)
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
//        Timber.d("%s--onSaveInstanceState", activity::class.java.simpleName)
    }

    override fun onActivityDestroyed(activity: Activity) {
        Timber.d("%s--onDestroy", activity::class.java.simpleName)
    }
}