package com.akycfc.cryptoapp.domain.model

import com.akycfc.cryptoapp.data.remote.dto.Team

data class CoinDetail(
    val coinId:String,
    val name:String,
    val description:String,
    val symbol:String,
    val rank:Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<Team>
)

data class Team(
    val id: String,
    val name: String,
    val position: String
)