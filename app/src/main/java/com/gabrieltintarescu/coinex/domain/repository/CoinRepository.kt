package com.gabrieltintarescu.coinex.domain.repository

import com.gabrieltintarescu.coinex.data.remote.dto.CoinDetailDto
import com.gabrieltintarescu.coinex.data.remote.dto.CoinDto

/**
 * @project Coinex
 * @author Gabriel Tintarescu
 * @created 10/25/2022
 *
 * Defining coin repository and it's functions
 */
interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}