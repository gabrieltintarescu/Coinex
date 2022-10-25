package com.gabrieltintarescu.coinex.presentation

/**
 * @project Coinex
 * @author Gabriel Tintarescu
 * @created 10/25/2022
 */
sealed class Screen(val route: String)
{
    object CoinListScreen: Screen("coin_list_screen")
    object CoinDetailScreen: Screen("coin_detail_screen")
}
