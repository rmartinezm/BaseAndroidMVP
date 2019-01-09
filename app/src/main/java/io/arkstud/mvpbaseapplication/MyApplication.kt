package io.arkstud.mvpbaseapplication

import android.app.Application
import io.arkstud.mvpbaseapplication.di.appModule
import org.koin.android.ext.android.startKoin

class MyApplication : Application() {

    /**
     *
     */
    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(appModule))
    }

}