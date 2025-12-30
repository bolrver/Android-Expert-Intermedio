package com.bolrver.horoscapp.data.network

import com.bolrver.horoscapp.data.network.response.PredictionRespond
import retrofit2.http.GET
import retrofit2.http.Path

interface HoroscopeApiService {

    @GET("/{sign}")
    suspend fun getHoroscope(@Path("sign") sign:String): PredictionRespond

}