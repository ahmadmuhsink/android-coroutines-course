package com.techyourchance.coroutines.exercises.exercise1

import com.techyourchance.coroutines.common.ThreadInfoLogger
import kotlinx.coroutines.delay
import kotlin.random.Random

class GetReputationEndpoint {
    suspend fun getReputation(userId: String): Int {
        ThreadInfoLogger.logThreadInfo("GetReputationEndpoint#getReputation(userId: $userId): called")
        delay(1500)
        ThreadInfoLogger.logThreadInfo("GetReputationEndpoint#getReputation(userId: $userId): return data")
        return Random.nextInt(0, 100)
    }
}
