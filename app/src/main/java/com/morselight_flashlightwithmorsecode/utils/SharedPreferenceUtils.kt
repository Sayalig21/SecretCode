package com.morselight_flashlightwithmorsecode.app.utils

import android.content.Context
import android.content.SharedPreferences
import com.morselight_flashlightwithmorsecode.app.BuildConfig


class SharedPreferenceUtils(val context: Context) {

    fun setInt(key: String, value: Int) {
        val editor: SharedPreferences.Editor =
            context.getSharedPreferences(BuildConfig.APPLICATION_ID, Context.MODE_PRIVATE).edit()
        editor.putInt(key, value)
        editor.apply()
    }

    fun getInt(key: String, defaultInt: Int): Int {
        return context.getSharedPreferences(BuildConfig.APPLICATION_ID, Context.MODE_PRIVATE)
            .getInt(key, defaultInt)
    }
}
