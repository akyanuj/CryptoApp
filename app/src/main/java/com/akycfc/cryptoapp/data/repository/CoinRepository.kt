package com.akycfc.cryptoapp.data.repository

import com.akycfc.cryptoapp.data.remote.dto.CoinDetailDto
import com.akycfc.cryptoapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}