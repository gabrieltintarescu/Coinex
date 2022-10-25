package com.gabrieltintarescu.coinex.domain.model


/**
 * @project Coinex
 * @author Gabriel Tintarescu
 * @created 10/25/2022
 */
data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String
)