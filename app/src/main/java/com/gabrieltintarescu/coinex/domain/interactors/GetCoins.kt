package com.gabrieltintarescu.coinex.domain.interactors

import com.gabrieltintarescu.coinex.common.Resource
import com.gabrieltintarescu.coinex.data.remote.dto.toCoin
import com.gabrieltintarescu.coinex.domain.model.Coin
import com.gabrieltintarescu.coinex.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

/**
 * @project Coinex
 * @author Gabriel Tintarescu
 * @created 10/25/2022
 *
 * Get coins use-case
 */
class GetCoins @Inject constructor(
    private val repository: CoinRepository
) {
    /**
     * Overriding invoke function so we can call  GetCoins() directly.
     * Returning a Flow to emit multiple values over period of time.
     * */
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success(coins))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}