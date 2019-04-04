package com.example.kointest.model.main.restclient

import com.example.kointest.model.main.restclient.model.Response
import io.reactivex.Single
import org.koin.core.KoinComponent
import org.koin.core.inject
import retrofit2.Retrofit

class MainComponent: KoinComponent {
    private val retrofit: Retrofit by inject()
    fun getUsers(id:Int): Single<Response> = retrofit.create(ApiService::class.java).getUsers(id)
    fun getDetial(): Single<Response> =retrofit.create(ApiService::class.java).getUsersDetail(1)

}