package com.example.lab_week_11.Preference

import android.app.Application
import com.example.lab_week_11.Preference.PreferenceWrapper

class PreferenceApplication : Application() {
    lateinit var preferenceWrapper: PreferenceWrapper

    override fun onCreate() {
        super.onCreate()

        // Initialize the preference wrapper
        preferenceWrapper = PreferenceWrapper(
            getSharedPreferences(
                "prefs",
                MODE_PRIVATE
            )
        )
    }
}