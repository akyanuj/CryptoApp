package com.akycfc.cryptoapp.di

import com.akycfc.cryptoapp.common.Constants
import com.akycfc.cryptoapp.data.remote.CoinPaprikaApi
import com.akycfc.cryptoapp.data.repository.CoinRepository
import com.akycfc.cryptoapp.data.repository.CoinRepositoryImpl
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) //how long dependencies live
object AppModule {

    @Provides
    @Singleton // single instance throughout whole life time of app
    fun providePaprikaApi(): CoinPaprikaApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinPaprikaApi): CoinRepository{
        return CoinRepositoryImpl(api)
    }

}