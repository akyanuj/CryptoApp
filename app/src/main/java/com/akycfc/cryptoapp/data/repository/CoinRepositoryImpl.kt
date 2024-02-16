package com.akycfc.cryptoapp.data.repository

import com.akycfc.cryptoapp.data.remote.CoinPaprikaApi
import com.akycfc.cryptoapp.data.remote.dto.CoinDetailDto
import com.akycfc.cryptoapp.data.remote.dto.CoinDto
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}