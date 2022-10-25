package com.gabrieltintarescu.coinex.data.repository

import com.gabrieltintarescu.coinex.data.remote.CoinPaprikaApi
import com.gabrieltintarescu.coinex.data.remote.dto.CoinDetailDto
import com.gabrieltintarescu.coinex.data.remote.dto.CoinDto
import com.gabrieltintarescu.coinex.domain.repository.CoinRepository
import javax.inject.Inject

/**
 * @project Coinex
 * @author Gabriel Tintarescu
 * @created 10/25/2022
 *
 * Coin repository implementation using
 * CoinPaprikaApi dependency injected
 */
class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> = api.getCoins()

    override suspend fun getCoinById(coinId: String): CoinDetailDto = api.getCoinById(coinId)
}
