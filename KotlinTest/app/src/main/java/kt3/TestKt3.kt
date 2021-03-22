package kt3

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.lang.Exception

suspend fun main() {


    val mJobs = GlobalScope.launch {

        //交替执行
        val job = launch {
            for (i in 1..1000) {
                println("----------job,$i")
                if (i == 500){
                    throw Exception()//不会影响第二个协程退出
                }
            }
        }
        val job2 = launch {
            for (j in 1..1000){
                println("*********job2,$j")
            }
        }
    }
    mJobs.join()
}