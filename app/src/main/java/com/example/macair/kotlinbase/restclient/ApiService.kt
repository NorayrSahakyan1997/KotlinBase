package com.example.kointest.model.main.restclient

import com.example.kointest.model.main.restclient.model.Response
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiService {

    @GET("api/users")
    fun getUsers(@Query("page") page: Int): Single<Response>

    @GET("api/user")
    fun getUsersDetail(@Query("page") page:Int): Single<Response>
}