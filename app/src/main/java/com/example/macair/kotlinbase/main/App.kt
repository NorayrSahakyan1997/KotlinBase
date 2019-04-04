package com.example.macair.kotlinbase.main

import android.app.Application
import com.example.kointest.model.main.restclient.retrofitModule
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(applicationContext)
            modules(retrofitModule("https://reqres.in/"))
        }
    }
}