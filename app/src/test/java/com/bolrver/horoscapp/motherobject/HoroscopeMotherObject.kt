package com.bolrver.horoscapp.motherobject

import com.bolrver.horoscapp.data.network.response.PredictionRespond
import com.bolrver.horoscapp.domain.model.HoroscopeInfo.Aquarius
import com.bolrver.horoscapp.domain.model.HoroscopeInfo.Aries
import com.bolrver.horoscapp.domain.model.HoroscopeInfo.Cancer
import com.bolrver.horoscapp.domain.model.HoroscopeInfo.Capricorn
import com.bolrver.horoscapp.domain.model.HoroscopeInfo.Gemini
import com.bolrver.horoscapp.domain.model.HoroscopeInfo.Leo
import com.bolrver.horoscapp.domain.model.HoroscopeInfo.Libra
import com.bolrver.horoscapp.domain.model.HoroscopeInfo.Pisces
import com.bolrver.horoscapp.domain.model.HoroscopeInfo.Sagittarius
import com.bolrver.horoscapp.domain.model.HoroscopeInfo.Scorpio
import com.bolrver.horoscapp.domain.model.HoroscopeInfo.Taurus
import com.bolrver.horoscapp.domain.model.HoroscopeInfo.Virgo

object HoroscopeMotherObject {

    val anyResponse = PredictionRespond("date", "prediction", "taurus")

    val horoscopeInfoList = listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius,
        Pisces
    )
}