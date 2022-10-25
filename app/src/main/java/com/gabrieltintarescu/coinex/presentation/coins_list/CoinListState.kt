package com.gabrieltintarescu.coinex.presentation.coins_list

import com.gabrieltintarescu.coinex.domain.model.Coin

/**
 * @project Coinex
 * @author Gabriel Tintarescu
 * @created 10/25/2022
 */
data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
