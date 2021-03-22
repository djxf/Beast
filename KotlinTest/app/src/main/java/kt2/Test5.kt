package kt2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime


/**
 * 异步风格的函数
 *
 */

fun main() {
    val elapsedTime = measureTimeMillis {
        val value1 = intValue1Async()
        val value2 = intValue2Async()

        runBlocking {
            println("the answer is: ${value1.await() + value2.await()}")
        }
    }
    println("耗时：$elapsedTime")
}

private suspend fun intValue1() : Int {
    delay(2000)
    return 20
}

private suspend fun intValue2() : Int {
    delay(3500)
    return 35
}

fun intValue1Async() = GlobalScope.async {
    intValue1()
}

fun intValue2Async() = GlobalScope.async {
    intValue2()
}