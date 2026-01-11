package com.bolrver.horoscapp.ui.horoscope

import com.bolrver.horoscapp.data.providers.HoroscopeProvider
import com.bolrver.horoscapp.domain.model.HoroscopeInfo
import com.bolrver.horoscapp.motherobject.HoroscopeMotherObject.horoscopeInfoList
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Test

class HoroscopeViewModelTest {

    @MockK
    lateinit var horoscopeProvider: HoroscopeProvider

    private lateinit var viewModel: HoroscopeViewModel

    @Before
    fun setUp(){
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @Test
    fun `when viewmodel is created then horoscopes are loaded`(){
        every { horoscopeProvider.getHoroscopes() } returns horoscopeInfoList
        viewModel = HoroscopeViewModel(horoscopeProvider)


        val horoscopes : List<HoroscopeInfo> = viewModel.horoscope.value

        assertTrue(horoscopes.isNotEmpty())
    }

}