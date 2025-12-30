package com.bolrver.horoscapp.domain

import com.bolrver.horoscapp.data.network.response.PredictionRespond
import com.bolrver.horoscapp.domain.model.PredictionModel

interface Repository {

    suspend fun getPrediction(sign:String): PredictionModel?

}