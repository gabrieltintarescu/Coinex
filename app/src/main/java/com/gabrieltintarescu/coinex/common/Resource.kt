package com.gabrieltintarescu.coinex.common

/**
 * @project Coinex
 * @author Gabriel Tintarescu
 * @created 10/25/2022
 *
 * Wrapper class for objects containing information
 * about actual data and (error) messages.
 *
 */
sealed class Resource<T>(val data: T? = null, val message: String? = null){
    class Success<T>(data: T?) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T>(data: T? = null) : Resource<T>(data)
}