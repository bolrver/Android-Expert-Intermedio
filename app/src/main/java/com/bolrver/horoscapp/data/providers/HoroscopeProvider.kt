package com.bolrver.horoscapp.data.providers

import com.bolrver.horoscapp.domain.model.HoroscopeInfo
import com.bolrver.horoscapp.domain.model.HoroscopeInfo.*
import jakarta.inject.Inject

class HoroscopeProvider @Inject constructor () {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
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
}