package com.gabrieltintarescu.coinex.di

import com.gabrieltintarescu.coinex.common.Constants
import com.gabrieltintarescu.coinex.data.remote.CoinPaprikaApi
import com.gabrieltintarescu.coinex.data.repository.CoinRepositoryImpl
import com.gabrieltintarescu.coinex.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.annotation.Signed
import javax.inject.Singleton

/**
 * @project Coinex
 * @author Gabriel Tintarescu
 * @created 10/25/2022
 *
 * Dependency Injection
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi(): CoinPaprikaApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinPaprikaApi): CoinRepository {
        return CoinRepositoryImpl(api)
    }
}