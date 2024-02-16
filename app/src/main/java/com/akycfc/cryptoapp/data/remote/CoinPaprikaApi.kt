package com.akycfc.cryptoapp.data.remote

import com.akycfc.cryptoapp.data.remote.dto.CoinDetailDto
import com.akycfc.cryptoapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}

//https://api.coinpaprika.com/v1/coins
//https://api.coinpaprika.com/v1/coins/btc-bitcoin