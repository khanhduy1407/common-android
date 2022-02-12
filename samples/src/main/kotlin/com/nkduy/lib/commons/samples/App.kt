package com.nkduy.lib.commons.samples

import android.app.Application
import com.nkduy.lib.reprint.core.Reprint

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Reprint.initialize(this)
    }
}
