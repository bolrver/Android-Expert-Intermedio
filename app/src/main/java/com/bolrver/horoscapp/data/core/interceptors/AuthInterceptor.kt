package com.bolrver.horoscapp.data.core.interceptors

import jakarta.inject.Inject
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class AuthInterceptor @Inject constructor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request: Request = chain.request()
            .newBuilder()
            .header("Autorization", "jujujujuju")
            .build()
        return chain.proceed(request)
    }


}