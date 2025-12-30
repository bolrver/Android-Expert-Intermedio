package com.bolrver.horoscapp.data

import android.util.Log
import com.bolrver.horoscapp.data.network.HoroscopeApiService
import com.bolrver.horoscapp.data.network.response.PredictionRespond
import com.bolrver.horoscapp.domain.Repository
import com.bolrver.horoscapp.domain.model.PredictionModel
import javax.inject.Inject


class RepositoryImp @Inject constructor(private val apiService: HoroscopeApiService): Repository {

    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("Danie", "aki se ha roto algo ${it.message}") }
            return null
    }


}