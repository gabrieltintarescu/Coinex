package com.gabrieltintarescu.coinex.data.remote.dto


import com.gabrieltintarescu.coinex.domain.model.Coin
import com.google.gson.annotations.SerializedName

/**
 * @project Coinex
 * @author Gabriel Tintarescu
 * @created 10/25/2022
 *
 * Data Transfer Object for the coin object
 * we will receive from the API
 */
data class CoinDto(
    @SerializedName("id")
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    @SerializedName("name")
    val name: String,
    @SerializedName("rank")
    val rank: Int,
    @SerializedName("symbol")
    val symbol: String,
    @SerializedName("type")
    val type: String
)

/** Function to convert Coin DTO to Coin */
fun CoinDto.toCoin(): Coin = Coin(
    id = id,
    isActive = isActive,
    name = name,
    rank = rank,
    symbol = symbol
)