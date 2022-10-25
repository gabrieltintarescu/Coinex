package com.gabrieltintarescu.coinex.data.remote

import com.gabrieltintarescu.coinex.data.remote.dto.CoinDetailDto
import com.gabrieltintarescu.coinex.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @project Coinex
 * @author Gabriel Tintarescu
 * @created 10/25/2022
 *
 * Retrofit API interface where the different
 * functions and routes we want to access from
 * our API will be defined.
 */
interface CoinPaprikaApi {

    /** API for retrieving list of coins */
    @GET("coins")
    suspend fun getCoins(): List<CoinDto>

    /** API for retrieving coin details by ID */
    @GET("coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}