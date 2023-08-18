package com.example.a91sqfeet

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET
    suspend fun getProducts(): Call<Products>

}