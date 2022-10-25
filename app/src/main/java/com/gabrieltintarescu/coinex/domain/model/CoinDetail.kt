package com.gabrieltintarescu.coinex.domain.model

import com.gabrieltintarescu.coinex.data.remote.dto.TeamMember

/**
 * @project Coinex
 * @author Gabriel Tintarescu
 * @created 10/25/2022
 */
data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)
