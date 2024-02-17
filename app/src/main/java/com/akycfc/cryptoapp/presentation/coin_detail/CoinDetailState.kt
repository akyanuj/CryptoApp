package com.akycfc.cryptoapp.presentation.coin_detail

import com.akycfc.cryptoapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading:Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
