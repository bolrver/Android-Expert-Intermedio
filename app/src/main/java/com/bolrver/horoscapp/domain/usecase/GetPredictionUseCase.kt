package com.bolrver.horoscapp.domain.usecase

import com.bolrver.horoscapp.domain.Repository
import jakarta.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke(sign: String) = repository.getPrediction(sign)

}