package com.example.myapplication.network

import com.example.myapplication.APIService
import com.example.myapplication.env_variable.EnvironmentalUrl
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    val myApi: APIService
    companion object {
        @JvmStatic
        @get:Synchronized
        var instance: RetrofitClient? = null
            get() {
                if (field == null) {
                    field = RetrofitClient()
                }
                return field
            }
    }
    init {
        val retrofit = Retrofit.Builder().baseUrl(EnvironmentalUrl.baseUrl.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        myApi = retrofit.create(APIService::class.java)
    }

}