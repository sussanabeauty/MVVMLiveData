package org.sussanacode.mvvmapplication.api


import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("getProducts")
    fun getProducts(): Call<ProductResponseData>
}