package com.example.services

import android.content.Intent
import android.util.Log
import androidx.lifecycle.LifecycleService

class LocationService : LifecycleService() {

    private val TAG = LocationService::class.java.simpleName

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        intent?.let {
            when(it.action) {
                ACTION_ON_START_OR_RESUME_SERVICE -> {
                    Log.wtf(TAG, "onStartCommand: start or resume ")
                }
                ACTION_ON_PAUSE_SERVICE -> {
                    Log.wtf(TAG, "onStartCommand: pause")
                }
                else -> {
                    Log.wtf(TAG, "onStartCommand: stop")
                }
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }

    companion object {
        const val ACTION_ON_PAUSE_SERVICE = "ACTION_ON_PAUSE_SERVICE"
        const val ACTION_ON_START_OR_RESUME_SERVICE = "ACTION_ON_START_OR_RESUME_SERVICE"
        const val ACTION_ON_STOP_SERVICE = "ACTION_ON_STOP_SERVICE"
    }
}