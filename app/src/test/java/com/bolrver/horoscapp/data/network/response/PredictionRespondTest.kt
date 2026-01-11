package com.bolrver.horoscapp.data.network.response

import com.bolrver.horoscapp.domain.model.HoroscopeInfo
import com.bolrver.horoscapp.domain.model.PredictionModel
import com.bolrver.horoscapp.motherobject.HoroscopeMotherObject
import com.bolrver.horoscapp.motherobject.HoroscopeMotherObject.anyResponse
import io.kotest.matchers.shouldBe
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class PredictionRespondTest {

    @Test
    fun `toDomain should return a correct PredictionModel`(){
        //Given
        val horoscopeResponse: PredictionRespond = anyResponse.copy(sign = "Libra")

        //When
        val predictionModel: PredictionModel = horoscopeResponse.toDomain()

        //Then
        predictionModel.sign shouldBe horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope
    }
}