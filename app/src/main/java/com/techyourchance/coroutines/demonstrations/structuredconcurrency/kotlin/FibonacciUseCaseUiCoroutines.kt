package com.techyourchance.coroutines.demonstrations.structuredconcurrency.kotlin

import kotlinx.coroutines.*
import java.math.BigInteger

internal class FibonacciUseCaseUiCoroutines() {

    suspend fun computeFibonacci(index: Int): BigInteger = withContext(Dispatchers.Default) {
        when (index) {
            0 -> BigInteger("0")
            1 -> BigInteger("1")
            else -> computeFibonacci(index - 1).add(computeFibonacci(index - 2))
        }
    }

}
