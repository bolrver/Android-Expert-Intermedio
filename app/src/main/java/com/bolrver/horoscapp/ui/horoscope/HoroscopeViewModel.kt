package com.bolrver.horoscapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.bolrver.horoscapp.data.providers.HoroscopeProvider
import com.bolrver.horoscapp.domain.model.HoroscopeInfo
import com.bolrver.horoscapp.domain.model.HoroscopeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@HiltViewModel

class HoroscopeViewModel @Inject constructor(val horoscopeProvider: HoroscopeProvider): ViewModel() {

    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())

    val horoscope: StateFlow<List<HoroscopeInfo>> = _horoscope

    init{
        _horoscope.value = horoscopeProvider.getHoroscopes()
    }
}