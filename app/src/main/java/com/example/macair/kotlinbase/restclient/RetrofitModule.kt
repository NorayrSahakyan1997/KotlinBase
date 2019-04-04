package com.example.kointest.model.main.restclient

import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


fun retrofitModule(baseUrl: String) = module {

    single {
        OkHttpClient.Builder()
    }

    single {
        Retrofit.Builder()
    }

    single {
        get<Retrofit.Builder>()
                .client(get<OkHttpClient.Builder>().build())
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

}