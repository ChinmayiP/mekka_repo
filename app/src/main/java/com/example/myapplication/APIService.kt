package com.example.myapplication

import com.example.myapplication.models.HeroNames
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET


interface APIService {

    @GET("marvel")
    fun getHeroes(): Call<List<HeroNames>>
}

