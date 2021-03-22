package kt3

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.lang.Exception

/*
    父子协程的异常与取消。
    协程的取消总是会沿着协程的层次体系向上传播。
    协程：核心是在用户线程中模拟操作系统线程并进行调度。

 */
fun main() = runBlocking<Unit> {
    try {
        failureComputation()
    }finally {
        println("Computation failed")
    }
}

private suspend fun failureComputation(): Int = coroutineScope {

    val value1 = async<Int>{
        try {
            delay(9000000)
            50
        }finally {
            println("value1 was cancelled")
        }
    }

    val value2 = async<Int> {
        Thread.sleep(2000)
        println("value2 throws an exception")
        throw Exception()
    }

    value1.await() + value2.await()
}