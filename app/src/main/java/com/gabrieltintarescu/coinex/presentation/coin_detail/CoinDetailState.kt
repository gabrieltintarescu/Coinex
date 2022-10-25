package com.gabrieltintarescu.coinex.presentation.coin_detail

import com.gabrieltintarescu.coinex.domain.model.Coin
import com.gabrieltintarescu.coinex.domain.model.CoinDetail

/**
 * @project Coinex
 * @author Gabriel Tintarescu
 * @created 10/25/2022
 */
data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? =  null,
    val error: String = ""
)
