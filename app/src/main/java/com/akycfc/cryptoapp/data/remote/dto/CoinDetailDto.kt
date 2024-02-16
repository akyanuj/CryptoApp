package com.akycfc.cryptoapp.data.remote.dto

import com.akycfc.cryptoapp.domain.model.CoinDetail
import com.google.gson.annotations.SerializedName

data class CoinDetailDto(
    val description: String, // Bitcoin is a cryptocurrency and worldwide payment system. It is the first decentralized digital currency, as the system works without a central bank or single administrator.
    val development_status: String, // Working product
    val first_data_at: String, // 2010-07-17T00:00:00Z
    val hardware_wallet: Boolean, // true
    val hash_algorithm: String, // SHA256
    val id: String, // btc-bitcoin
    @SerializedName("is_active")
    val isActive: Boolean, // true
    val is_new: Boolean, // false
    val last_data_at: String, // 2024-02-16T22:06:00Z
    val links: Links,
    val links_extended: List<Any>,
    val logo: String, // https://static.coinpaprika.com/coin/btc-bitcoin/logo.png
    val message: String,
    val name: String, // Bitcoin
    val open_source: Boolean, // true
    val org_structure: String, // Decentralized
    val proof_type: String, // Proof of Work
    val rank: Int, // 1
    val started_at: String, // 2009-01-03T00:00:00Z
    val symbol: String, // BTC
    val tags: List<Tag>,
    val team: List<Team>,
    val type: String, // coin
    val whitepaper: Whitepaper
)

fun CoinDetailDto.toCoinDetail(): CoinDetail{
    return CoinDetail(
        coinId = id,
        name = name,
        description = description,
        symbol = symbol,
        isActive = isActive,
        rank = rank,
        tags = tags.map { it.name },
        team = team
    )
}