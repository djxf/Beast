package kt3

import kotlinx.coroutines.*
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import kotlin.coroutines.CoroutineContext


/*
    协程与线程之间的关系

    协程上下文，与分发器(Coroutine Context,Dispatcher)
    分发器：确定由哪个线程来执行我们所指定的代码。
    所有的协程构建器(coroutine builder)如luanch，async，都会接受一个可选的CoroutineContext参数，
    该参数可用于指定新协程所运行的分发器以及其他上下文元素。

    程序分析：
        1. 当通过launch来启动协程并且不指定协程分发器时，它会继承启动它的那个CoroutineScope的上下文
            与分发器。对于该实例时，继承runBlocking,而runBlocking运行在main线程中。
        2. Dispatchers.Unconfined是一种特殊的协程分发器，运行机制与不指定分发器完全不同。日常开发使用较少。
        3. Dispatchers.Default是默认的分发器，当协程是通过GlobalScope来启动时，他会使用默认的分发器来启动协程。
            它会使用后台一个共享的线程池来运行我们的协程代码。等价于Global.launch{}
        4. Executors.newSingleThreadExecutor().asCoroutineDispatcher()创建一个单线程的线程池，代价非常高。
            这里就必须需要使用close方法来释放必要的资源。


     使用async进行结构化并发程序并发。

 */


fun main() = runBlocking<Unit> {
    launch {
        println("No params,thread: ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Unconfined) {
        delay(100)
        println("Dispatchers.Unconfined,thread: ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Default) {
        println("Dispatchers.Default,thread: ${Thread.currentThread().name}")
    }
    val thread = Executors.newSingleThreadExecutor().asCoroutineDispatcher()
    launch(thread) {
        println("Single thread executors,thread: ${Thread.currentThread().name}")
        thread.close()
    }

    GlobalScope.launch {
        println("GlobalScope launch,thread: ${Thread.currentThread().name}")
    }


}